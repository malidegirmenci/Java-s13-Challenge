package employeeApp;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan basicHPlan = new Healthplan("0","Basic Health Plan",Plan.OUTPATIENT_TREATMENT);
        System.out.println("Plan name: "+basicHPlan.getPlan().getName() + "\nPlan price: "+ basicHPlan.getPlan().getPrice());
        System.out.println(basicHPlan.toString());


        Employee emp = new Employee("0","Mahmut Ekrem","ma@gmail.com","21312",new String[]{basicHPlan.getPlan().getName(),
                null,null,null});
        emp.addHealthPlan(3,Plan.CHEMOTHERAPY.getName());
        System.out.println(emp.toString());

        Company cmp = new Company("0","MAD SOFT",123123,new String[]{"Ali"});
        cmp.addEmployee(1,"Cabbar");
        System.out.println(cmp.toString());
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
