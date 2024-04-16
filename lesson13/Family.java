package lesson13;

public class Family {
    private Human mother;
    private Human father;
    private Pet pet;
    private Human[] children;
    

    public Family(Human mother, Human father, Pet pet, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.pet = pet;
        this.children = children;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }
    public void addChild(){

    }

    public void deleteChild(Human child){
        Human[] newArr=new Human[children.length-1];
        int existingIndex=0;
        for (int i = 0; i < children.length; i++) {
            if (children[i]==child) {
               existingIndex=i;
               break;
            }
        }

        if (existingIndex != -1) {
            Human[] newArray = new Human[children.length - 1];
            int newIndex = 0;
            for (int i = 0; i < children.length; i++) {
                if (i != existingIndex) {
                    newArray[newIndex] = children[i];
                    newIndex++;
                }
            }
            children = newArray;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
