package com.neuedu.test1;

/**
 * @author bin
 * @date 2020/2/11 0011 22:21
 */
public class SalariedEmployee extends ColaEmployee {
    private Integer wage;  // 固定工资

    public SalariedEmployee(String name,Integer wage,Integer month){
        super(name,month);
        this.wage = wage;
    }

    @Override
    public Double getSalary(Integer month) {
        return Double.valueOf(wage);
    }
}
