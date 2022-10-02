public class PersonFactory {

    public void getPerson(){
        Person person = createNewPerson(true);
        System.out.println(person);
    }


    private Person createNewPerson(Boolean toUpdate) {
        Person person  = new Person();
        person.setAge(3);
        person.setName("Petya");
        person.setSalary(100000);
        if (toUpdate){
            try {
                Person personClone = (Person) person.clone();
                updatePerson(personClone);
                System.out.println(personClone);
            } catch (Exception ex){}
        }
        return person;
    }


    private void updatePerson(Person person){
        person.setSalary(0);
    }



    // Не статический вложенный класс не может сущесвтовать без внешнего класса
    class Person {
        String name;
        Integer age;
        Integer salary;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Integer getSalary() {
            return salary;
        }

        public void setSalary(Integer salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Person person = new Person();
            person.setSalary(this.salary);
            person.setAge(this.age);
            person.setName(this.name);
            return person;
        }
    }

    // Зато статичекий может
//    static class InnerStaticClass {
//
//    }
}
