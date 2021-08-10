package com.winter.designPattern.memento.mementoDemo1;

/**
 * 游戏角色类,用来存储角色的生命力、攻击力、防御力的数据
 */
public class GameRole {
    //生命力
    private int vit;

    //攻击力
    private int atk;

    //防御力
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    //状态显示
    public void StateDisplay(){
        System.out.println("角色当前状态: ");
        System.out.println("体力: " + this.vit);
        System.out.println("攻击力: " + this.atk);
        System.out.println("防御力: " + this.def);
        System.out.println();
    }

    //获得初始状态
    //数据通常来自本地磁盘或远程数据库
    public void GetInitState(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    //战斗
    //在与Boss大战后游戏数据损耗为零
    public void Fight(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }
}
