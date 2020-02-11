package com.neuedu.test1;

/**
 * @author bin
 * @date 2020/2/11 0011 22:20
 */
public abstract class ColaEmployee {
    private String name;
    private Integer month;

    public ColaEmployee(String name,Integer month) {
        this.name = name;
        this.month = month;
    }

    public abstract Double getSalary(Integer month);
}
