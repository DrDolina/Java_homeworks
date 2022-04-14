public class Lesson_5 {

    public Lesson_5() {
    }

    public void main(String[] args) {

        Employee employee1 = new Employee(
                "Roman",
                "junior QA",
                "email@mail.ru",
                641682320,
                23
        );


        Employee employee2 = new Employee(
                "Ivan",
                "middle QA",
                "mail@gmail.com",
                641604623,
                28
        );


        System.out.println(employee1.getName());
        System.out.println(employee1.getPosition());
        System.out.println(employee1.getEmail());
        System.out.println(employee1.getTelephone());
        System.out.println(employee1.getAge());

        System.out.println();

        System.out.println(employee2.getName());
        System.out.println(employee2.getPosition());
        System.out.println(employee2.getEmail());
        System.out.println(employee2.getTelephone());
        System.out.println(employee2.getAge());


// Task 4
        Employee[] persArray = new Employee[5];


        persArray[0] = new Employee(
                "Igor",
                "junior DevOps",
                "devops@mail.ru",
                999666333,
                35
        );

        persArray[1] = new Employee(
                "Mihail",
                "middle DevOps",
                "devops@gmail.com",
                999333111,
                28
        );

        persArray[2] = new Employee(
                "Alex",
                "senior DevOps",
                "devops@rambler.ru",
                999666111,
                45
        );

        persArray[3] = new Employee(
                "Sergey",
                "junior Developer",
                "developer@mail.ru",
                777555333,
                23
        );

        persArray[4] = new Employee(
                "Olga",
                "junior developer",
                "developer@gmail.com",
                888555222,
                22
        );

        for (Employee employee : persArray){
            if (employee.getAge() > 40){
                System.out.println(employee);
            }
        }

    }

}


