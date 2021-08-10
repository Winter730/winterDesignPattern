package com.winter.designPattern.memento.mementoDemo1;

public class Main {
    public static void main(String[] args) {
        //大战Boss前
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.GetInitState();
        lixiaoyao.StateDisplay();

        //保存进度
        GameRole backup = new GameRole();
        backup.setVit(lixiaoyao.getVit());
        backup.setAtk(lixiaoyao.getAtk());
        backup.setDef(lixiaoyao.getDef());

        //大战Boss时,损耗严重
        lixiaoyao.Fight();
        lixiaoyao.StateDisplay();

        //恢复之前状态
        lixiaoyao.setVit(backup.getVit());
        lixiaoyao.setAtk(backup.getAtk());
        lixiaoyao.setDef(backup.getDef());

        lixiaoyao.StateDisplay();
    }
}
