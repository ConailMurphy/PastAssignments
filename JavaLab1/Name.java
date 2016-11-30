class Name {
      
    String title;
    String forename;
    String surname;

    public void setTitle(String t){ 
        title = t;
    }

    public void setForename(String f){
        forename = f;
    }

    public void setSurname(String s){
        surname = s;
    }



    public String getTitle() {
        return title;
    }

    public String getForename() {
        return forename;
    }
    public String getSurname() {
        return surname;
    }



    public String getFullName() {
        return (title + " " + forename + " " + surname);
    }

    public String toString() {
        return (title + " " + forename + " " + surname);         
    }

    public String getShortName() {
        return (title + " " + forename.substring(0 , 1) + " " + surname);
    }
}