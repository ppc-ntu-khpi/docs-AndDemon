package domain;

/**
 * Клас, що представляє художника.
 */
public class Artist extends Employee {

  /**
   * Створює нового художника з вказаними навичками, ім'ям, посадою, рівнем та відділом.
   * 
   * @param skills навички художника
   * @param name ім'я художника
   * @param jobTitle посада художника
   * @param level рівень художника
   * @param dept відділ художника
   */
  public Artist(String[] skills, String name, String jobTitle, int level, String dept) {
    super(name, jobTitle, level, dept);
    this.skills = skills;
  }

  /**
   * Створює нового художника з вказаними навичками.
   * 
   * @param skills навички художника
   */
  public Artist(String[] skills) {
    super();
    this.skills = skills;
  }
   
  /**
   * Створює нового художника з пустими навичками.
   */
  public Artist() {
    super();
    this.skills = new String[10];
  }

  /**
   * Повертає рядкове представлення художника з вказаними навичками.
   * 
   * @return рядкове представлення художника з навичками
   */
  @Override
  public String toString() {
    return super.toString()+"\nНавички: "+getSkills();
  }

  private String[] skills;

  /**
   * Повертає навички художника.
   * 
   * @return навички художника
   */
  public String getSkills() {
    String s = "";
    for (String e : skills) {
      s = s + e + ", ";
    }
    s=s.substring(0, s.length() - 2);
    return s;
  }

  /**
   * Встановлює навички художника.
   * 
   * @param skills навички художника
   */
  public void setSkills(String[] skills) {
    this.skills=skills;
  }

  /**
   * Повертає масив навичок художника.
   * 
   * @return масив навичок художника
   */
  public String[] getSkillsList() {
    return skills;
  }
}
