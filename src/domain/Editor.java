package domain;

/**
 * Клас, що представляє редактора.
 */
public class Editor extends Artist {

    /**
     * Створює нового редактора з вказаними параметрами електронного редагування, навичками, ім'ям, посадою, рівнем та відділом.
     * 
     * @param electronicEditing чи використовує редактор електронне редагування
     * @param skills навички редактора
     * @param name ім'я редактора
     * @param jobTitle посада редактора
     * @param level рівень редактора
     * @param dept відділ редактора
     */
    public Editor(boolean electronicEditing, String[] skills, String name, String jobTitle, int level, String dept) {
        super(skills, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює нового редактора з вказаними параметрами електронного редагування та навичками.
     * 
     * @param electronicEditing чи використовує редактор електронне редагування
     * @param skills навички редактора
     */
    public Editor(boolean electronicEditing, String[] skills) {
        super(skills);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює нового редактора з вказаним параметром електронного редагування.
     * 
     * @param electronicEditing чи використовує редактор електронне редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Створює нового редактора з параметром електронного редагування за замовчуванням (true).
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає рядкове представлення редактора з вказаними налаштуваннями редагування.
     * 
     * @return рядкове представлення редактора з налаштуваннями редагування
     */
    @Override
    public String toString() {
        String s = super.toString()+"\nНалаштування редагування= "; 
        if (electronicEditing)
            s = s + "електронне";
        else
            s = s + "папір";
        return s;
    }

    private boolean electronicEditing;

    /**
     * Повертає налаштування редагування редактора.
     * 
     * @return чи використовує редактор електронне редагування
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює налаштування редагування редактора.
     * 
     * @param electronic чи використовує редактор електронне редагування
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}
