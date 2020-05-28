package cn.hxg.proxy.jdkproxy;

public class MainClass {

    public static void main(String[] args) {

        JdkProxyTest jdkProxyTest = new JdkProxyTest();

        IBook iBook = (IBook)jdkProxyTest.bind(new Book());

        iBook.saleBook(1000);

    }

}
