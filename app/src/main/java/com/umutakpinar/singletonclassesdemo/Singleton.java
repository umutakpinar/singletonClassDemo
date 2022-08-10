package com.umutakpinar.singletonclassesdemo;

public class Singleton {
    private static String tasinacakVeri;
    private static Singleton singleton;

    private Singleton(){
        /* Böylece kimse kafasına göre instance oluşturamayacak */
    }

    public String getTasinacakVeri() {
        return tasinacakVeri;
    }

    public void setTasinacakVeri(String _tasinacakVeri){
        tasinacakVeri = _tasinacakVeri;
    }

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
