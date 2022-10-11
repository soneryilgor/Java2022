public class Main {
    public static void main(String[] args) {
        TeacherCreditManager teacherCreditManager=new TeacherCreditManager();
        teacherCreditManager.calculate();
        teacherCreditManager.save();

        CustomerPerson person1 = new CustomerPerson();
        person1.setId(12345);
        person1.setFirstName("Galip");
        person1.setLastName("ÇALIŞKAN");
        person1.setCity("Antalya");
        person1.setNationalIdentity("1525354555");

        CustomerCompany company1=new CustomerCompany();
        company1.setId(12346);
        company1.setCompanyName("Anadolu Selçuklu Ltd. Şti.");
        company1.setCity("Antalya");
        company1.setTaxNumber("3334445555");

        CustomerManager customerManager=new CustomerManager(person1, new TeacherCreditManager());
        customerManager.save();
        customerManager.giveCredit();

        CustomerManager customerManager1 = new CustomerManager(company1, new CarCreditManager());
        customerManager1.save();
        customerManager1.giveCredit();
        customerManager1.delete();
    }
}