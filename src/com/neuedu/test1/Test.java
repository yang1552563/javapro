package com.neuedu.test1;

/**
 * @author bin
 * @date 2020/2/11 0011 22:23
 */
public class Test {
    public static void main(String[] args) {
        ColaEmployee[] ce = new ColaEmployee[3];
        SalariedEmployee sde = new SalariedEmployee("员工1",5000,7);
        HourlyEmployee he = new HourlyEmployee("员工2",25,170,8);
        SalesEmployee se = new SalesEmployee("员工3",6050,0.2,4);
        ce[0] = sde;
        ce[1] = he;
        ce[2] = se;

        for (int i = 0; i < ce.length ; i++) {
            System.out.println(ce[i].getSalary(1));
        }
    }
}
