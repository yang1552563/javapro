package com.neuedu.test1;

/**
 * @author bin
 * @date 2020/2/11 0011 22:23
 */
public class SalesEmployee extends ColaEmployee{
    private Integer msv;  // 月销售额
    private Double rate;  // 提成率

    public SalesEmployee(String name,Integer msv,Double rate,Integer month){
        super(name,month);
        this.msv = msv;
        this.rate = rate;
    }

    @Override
    public Double getSalary(Integer month) {
        return msv*rate;
    }
}
