// Purpose
// Lately I have been getting into growing plants from seed. This is a process that is very daunting, but rewarding.
// I want to see how different conditions would affect the growth of my plants, such as how much sunlight and water the
// plant receives. So this program will be used to simulate seedling growth under different conditions.

// Collaborators: Ryan Moore and Caitlin Lim

public class PlantGrowth {
    public static void main(String[] args) {

        // DECLARATION SECTION
        int week; //weeks from 0 to 8
        int sunFull; // full, partial, and shaded will be calculated separately
        int sunPartial;
        int sunShaded;
        int waterTop; // top and bottom watered will be calculated in addition to sunlight
        int waterBottom;

        // INITIALIZATION SECTION

        // CALCULATION SECTION

        // method 1: calculate growth under different sunlight conditions - Ryan

        // method 2: calculate growth under different watering conditions - Caitlin
        calculateWaterConditions();

        // mathod 3: drawing seed - Ryan

        // method 4: introducing the user to the project - Caitlin

        // OUTPUT SECTION
    }
    
    // method 2: calculate growth under different watering conditions - Caitlin
    //for each sunlight condition there are 2 watering conditions waterTop will have an double of .9 and waterBottom will have an int of 1  
    public static void calculateWaterConditions()
    {
        int waterTop = (sunFull);
        int waterBottom = (sunFull+1);
        system.out.println("The plant grew "+ waterTop+" inches when watering from above in full sunlight.");
        system.out.println("The plant grew "+ waterBottom+" inches when watering from below in full sunlight.");

        int waterTop = (sunPartial);
        int waterBottom = (sunPartial+1);
        system.out.println("The plant grew "+ waterTop+" inches when watering from above in partial sunlight.");
        system.out.println("The plant grew "+ waterBottom+" inches when watering from below in partial sunlight.");

        int waterTop = (sunShaded);
        int waterBottom = (sunShaded+1);
        system.out.println("The plant grew "+ waterTop+" inches when watering from above in the shade.");
        system.out.println("The plant grew "+ waterBottom+" inches when watering from below in the shade.");

    }
}
