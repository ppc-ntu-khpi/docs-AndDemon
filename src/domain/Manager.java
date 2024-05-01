package domain;

/**
 * Клас, що представляє менеджера.
 */
public class Manager extends Employee {

    /**
     * Створює нового менеджера з вказаними співробітниками, ім'ям, посадою, рівнем та відділом.
     * 
     * @param employees масив співробітників, якими керує менеджер
     * @param name ім'я менеджера
     * @param jobTitle посада менеджера
     * @param level рівень менеджера
     * @param dept відділ менеджера
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Повертає рядкове представлення менеджера з переліком його співробітників.
     * 
     * @return рядкове представлення менеджера з переліком співробітників
     */
    @Override
    public String toString() {
        return super.toString()+"\nСпівробітники: "+getEmployees(); 
    }

    /**
     * Створює нового менеджера з вказаними співробітниками.
     * 
     * @param employees масив співробітників, якими керує менеджер
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Створює нового менеджера з порожнім списком співробітників.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Повертає перелік співробітників, якими керує менеджер.
     * 
     * @return перелік співробітників, якими керує менеджер
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює список співробітників, якими керує менеджер.
     * 
     * @param employees масив співробітників, якими керує менеджер
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Повертає масив співробітників, якими керує менеджер.
     * 
     * @return масив співробітників, якими керує менеджер
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
