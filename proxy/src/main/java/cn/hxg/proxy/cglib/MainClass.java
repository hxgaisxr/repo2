package cn.hxg.proxy.cglib;

public class MainClass {

    public static void main(String[] args) {

        CglibTest cglibTest = new CglibTest();

        Company company = (Company)cglibTest.bind(new Company());

        company.saleCompany(10000);

    }

}
