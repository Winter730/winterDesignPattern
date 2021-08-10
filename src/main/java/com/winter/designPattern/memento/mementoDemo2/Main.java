package com.winter.designPattern.memento.mementoDemo2;

public class Main {
    public static void main(String arg[]){
        //大战Boss前
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.getInitState();
        lixiaoyao.stateDisplay();

        //保存进度
        //保存进度时,由于封装在Memento中,因此我们并不知道保存了哪些具体的角色数据
        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        stateAdmin.setMemento(lixiaoyao.saveState());

        //大战Boss时,损耗严重
        lixiaoyao.fight();
        lixiaoyao.stateDisplay();

        //恢复之前的状态
        lixiaoyao.recoveryState(stateAdmin.getMemento());
        lixiaoyao.stateDisplay();


    }
}
