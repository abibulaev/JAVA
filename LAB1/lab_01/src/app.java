import java.util.Scanner;

public class app {
    public static Student[] Student = new Student[10];

    public static void main(String[] args) {

        Student[0] = new Student(0,"Седов","Архип "," Алексеевич",23,12,2011,"Гоголя",21474836,"Цифровой подготовительный",1,2);
        Student[1] = new Student(1,"Миронов","Ян","Кузьмич",5,11,2015,"Титова",21474836,"Экономический",1,2);
        Student[2] = new Student(2,"Переверзев ","Адриан","Иннокентьевич",26,8,2008,"Пушкина",21474836,"физико-математических и естественных наук",2,2);
       Student[3] = new Student(3,"Ярцев","Дамир","Никитич",25,5,1998,"Киевская",21474836,"Филологический",3,1);
        Student[4] = new Student(4,"Малюгин","Казимир ","Алексеевич",2,2,2001,"Титова",21474836,"Филологический",2,1);
        Student[5] = new Student(5,"Драгомиров","Казимир","Янович",5,5,2001,"Киевская",21474836,"Экономический",1,1);
       Student[6] = new Student(6,"Стеблев","Фуад","Русланович",6,2,2008,"Севастопольская",21474836,"Экономический",4,2);
       Student[7] = new Student(7,"Захарьин","Велизар","Иннокентьевич",3,5,12,"Киевская",21474836,"физико-математических и естественных наук",2,2);
       Student[8] = new Student(8,"Громов","Люсьен","Арсеньевич",5,13,2001,"Севастопольская",21474836,"Цифровой подготовительный",3,1);
       Student[9] = new Student(9,"Калганов","Тигран","Маркович",6,4,2006,"Киевская",21474836,"Цифровой подготовительный",2,1);


     //  zadannblyFacultet();
       //kajdFacultetICourse();
       poDateRojdeniya();
       // numGroup();
    }




    public static void zadannblyFacultet()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название факультета:");
        String facultet = scanner.nextLine();

        for (Student student : Student) {
            if (student.faculty.equals(facultet)) {
                System.out.println(student.toString());
            }
        }
    }



    public static void kajdFacultetICourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название факультета:");
       String facultet = scanner.nextLine();
        System.out.print("Введите номер курса: ");
        int num_course = scanner.nextInt();

        for (Student student : Student) {
            if (student.faculty.equals(facultet)) {
                if (student.course == num_course) {
                    System.out.println(student.toString());
                }

            }

        }
        }


    public static void poDateRojdeniya()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год рождения: ");
        int god_rojd = scanner.nextInt();

        for (Student student : Student) {
            if (student.years > god_rojd) {
                System.out.println(student.toString());
            }
        }
    }

    public static void numGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название факультета:");
        String facultet = scanner.nextLine();
        System.out.print("Введите номер курса: ");
        int num_course = scanner.nextInt();
        System.out.print("Введите номер группы: ");
        int num_group = scanner.nextInt();

        for (Student student : Student) {
            if (student.faculty.equals(facultet)) {
                if (student.course == num_course) {
                    if(student.group==num_group){
                    System.out.println(student.toString());
                }

            }

        }
    }}}