package cn.hxg.proxy.jdkproxy;

public class Book implements IBook {

    public void saleBook(double money) {

        System.out.println("这本书卖了:" + money);

    }

}
