import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Product {
    ArrayList<Price> price;
    ArrayList<Buket> Buket_list;

    public static void main(String[] args) {
        Product product = new Product();
        product.Buket_list=new ArrayList<Buket>();
        Buket buket_temp=new Buket(36.5,"Роза","Красная",3.27,5);
        product.Buket_list.add(buket_temp);
        buket_temp=new Buket(20,"Роза", "Зеленая",3.22,2);
        product.Buket_list.add(buket_temp);
        buket_temp= new Buket(55.56, "Фиалка", "Желтая",2.27,4);
        product.Buket_list.add(buket_temp);
       // product.priceCount();
        //product.SortBuket();
        product.VivodPoCrit(0,8);


    }
    public int priceCount()
    {
        return price.size();
    }

    public void SortBuket()
    {
        Comparator<? super Buket> comparator = null;
        Buket_list.sort(comparator);
        Collections.sort(Buket_list,new Comparator<Buket>(){
            @Override
            public int compare(Buket o1, Buket o2) {
                return o1.dlina - o2.dlina;
            }
        });
        for (int i=0; i<Buket_list.size(); i++)
        {
            System.out.println(Buket_list.get(i).name);

        }
    }
    public void VivodPoCrit(int cost_min, int cost_max)
    {
        for (int i=0; i<Buket_list.size(); i++)

        {
            if (Buket_list.get(i).dlina >= cost_min && Buket_list.get(i).dlina <= cost_max)
            {

                System.out.println(Buket_list.get(i).name);

            }


        }
    }




}




