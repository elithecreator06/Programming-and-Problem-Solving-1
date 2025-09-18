/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Lab#: 13A
*/

public class Lab13A {
    public static void main(String[] args){
         BuildingBlueprint b1 = new BuildingBlueprint();
         BuildingBlueprint b2 = new BuildingBlueprint(30,30, 0.75f);

        int a = b1.getNumOfApartments();
        int s = b1.getNumOfStories();
        float o = b1.getOccupyRate();
        boolean is = b1.getIsItOccupy();
        float change = (o * 100);

        int a2 = b2.getNumOfApartments();
        int s2 = b2.getNumOfStories();
        float o2 =  b2.getOccupyRate();
        boolean is2 = b2.getIsItOccupy();
        float change2 = (o2 * 100);

        System.out.println("Year 2020: ");
        System.out.println("Building 1 has " +s+ " floors, " +a+ " apartments, and is " +(change)+ "% occupied. Full? " +is);
        System.out.println("Building 2 has " +s2+ " floors, " +a2+ " apartments, and is " +(change2)+ "% occupied. Full? " +is2);
        System.out.println("\nMany years pass.\n");
        System.out.println("Year 2043: ");
        b1.setOccupyRate(0.0f);
        o = b1.getOccupyRate();
        change = (o * 100);
        b2.setOccupyRate(1.0f);
        o2 = b2.getOccupyRate();
        change2 = (o2 * 100);
        System.out.println("Building 1 has " +s+ " floors, " +a+ " apartments, and is " +(change)+ "% occupied. Full? " +b1.getIsItOccupy());
        System.out.println("Building 2 has " +s2+ " floors, " +a2+ " apartments, and is " +(change2)+ "% occupied. Full? " +b2.getIsItOccupy());

        System.out.println("\nLooks like people prefer taller buildings.");

    }
    static class BuildingBlueprint{
        private final int numOfStories;
        private final int numOfApartments;
        private float occupyRate;
        private boolean isItOccupy;

        BuildingBlueprint(){
            numOfStories = 10;
            numOfApartments = 20;
            occupyRate = 1.0f;
            isItOccupy = true;
        }
        public BuildingBlueprint(int numOfStories, int numOfApartments, float occupyRate){
            this.numOfStories = numOfStories;
            this.numOfApartments = numOfApartments;
            this.occupyRate = occupyRate;
            isItOccupy = this.occupyRate == 1.0f;

        }

        public void setOccupyRate(float occupyRate){
            this.occupyRate = occupyRate;
        }

        public float getOccupyRate(){
            return occupyRate;
        }

        public int getNumOfStories(){
            return numOfStories;
        }

        public int getNumOfApartments(){
            return numOfApartments;
        }

        public boolean getIsItOccupy(){
            isItOccupy = this.occupyRate == 1.0f;
            return isItOccupy;
        }
    }
}
