package com.neuedu.test1;

/**
 * @author bin
 * @date 2020/2/11 0011 22:22
 */
public class HourlyEmployee extends ColaEmployee {
    private Integer hourlywage;  // 每小时的工资
    private Integer hourage;  // 每个月工作的小时数

    public HourlyEmployee(String name,Integer hourlywage,Integer hourage,int month) {
        super(name,month);
        this.hourlywage = hourlywage;
        this.hourage = hourage;
    }

    @Override
    public Double getSalary(Integer month) {
        if( hourage <= 160){
            return Double.valueOf(hourlywage * hourage);
        }else{
            return 160 * hourlywage + (hourage-160) * 1.5 * hourlywage;
        }
    }
}
