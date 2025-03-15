// Purpose
// Lately I have been getting into growing plants from seed. This is a process that is very daunting, but rewarding.
// I want to see how different conditions would affect the growth of my plants, such as how much sunlight and water the
// plant receives. So this program will be used to simulate seedling growth under different conditions.

// Collaborators: Ryan Moore and Caitlin Lim

import org.w3c.dom.ls.LSOutput;

public class PlantGrowth
{
    public static void main(String[] args)
    {

        // DECLARATION SECTION
        int week; //weeks from 0 to 8
        double sunFull, sunPartial, sunShaded; // full, partial, and shaded will be calculated separately
        int fertilizerNotPresent, fertilizerPresent; // presence of fertilizer in soil
        double growthRateFullFert; // rate of growth increase after each week for full sun and top water
        double growthRatePartialFert; // partial sun and top water
        double growthRateShadedFert; // etc.
        double growthRateFullNoFert;
        double growthRatePartialNoFert;
        double growthRateShadedNoFert;
        String boxHoriz;
        String boxVert;
        String boxDownLeft;
        String boxDownRight;
        String boxUpRight;
        String boxUpLeft;

        // INITIALIZATION SECTION
        week = 0;
        sunFull = 1.0;
        sunPartial = 0.5;
        sunShaded = 0.0;
        fertilizerNotPresent = 0;
        fertilizerPresent = 1;
        growthRateFullFert = 1.0; // Initialize all growth rates to 1.0. Methods will rectify to final growth rate
        growthRatePartialFert = 1.0;
        growthRateShadedFert = 1.0;
        growthRateFullNoFert = 1.0;
        growthRatePartialNoFert = 1.0;
        growthRateShadedNoFert = 1.0;


        // CALCULATION SECTION

        // method 1: calculate growth under different sunlight conditions - Ryan
        growthRateFullFert = calculateSunConditions(growthRateFullFert, sunFull);
        growthRatePartialFert = calculateSunConditions(growthRatePartialFert, sunPartial);
        growthRateShadedFert = calculateSunConditions(growthRateShadedFert, sunShaded);
        growthRateFullNoFert = calculateSunConditions(growthRateFullNoFert, sunFull);
        growthRatePartialNoFert = calculateSunConditions(growthRatePartialNoFert, sunPartial);
        growthRateShadedNoFert = calculateSunConditions(growthRateShadedNoFert, sunShaded);

        // method 2: calculate growth under different fertilizer conditions - Caitlin
        growthRateFullFert = calculateFertilizer(growthRateFullFert, fertilizerPresent);
        growthRatePartialFert = calculateFertilizer(growthRatePartialFert, fertilizerPresent);
        growthRateShadedFert = calculateFertilizer(growthRateShadedFert, fertilizerPresent);
        growthRateFullNoFert = calculateFertilizer(growthRateFullNoFert, fertilizerNotPresent);
        growthRatePartialNoFert = calculateFertilizer(growthRatePartialNoFert, fertilizerNotPresent);
        growthRateShadedNoFert = calculateFertilizer(growthRateShadedNoFert, fertilizerNotPresent);

        // mathod 3: drawing seed - Ryan


        // method 4: introducing the user to the project - Caitlin

        // OUTPUT SECTION
        week = 0;

        System.out.println();
        drawPlant(week, growthRateFullFert);
        System.out.println("^ Week " + week + ": " + "Full Sunlight + Fertilizer ^");

        System.out.println();
        drawPlant(week, growthRatePartialFert);
        System.out.println("^ Week " + week + ": " + "Partial Sunlight + Fertilizer ^");

        System.out.println();
        drawPlant(week, growthRateShadedFert);
        System.out.println("^ Week " + week + ": " + "Shaded + Fertilizer ^");

        System.out.println();
        drawPlant(week, growthRateFullNoFert);
        System.out.println("^ Week " + week + ": " + "Full Sunlight + No Fertilizer ^");

        System.out.println();
        drawPlant(week, growthRatePartialNoFert);
        System.out.println("^ Week " + week + ": " + "Partial Sunlight + No Fertilizer ^");

        System.out.println();
        drawPlant(week, growthRateShadedNoFert);
        System.out.println("^ Week " + week + ": " + "Shaded + No Fertilizer ^");

        week = 1;

        System.out.println();
        drawPlant(week, growthRateFullFert);
        System.out.println("^ Week " + week + ": " + "Full Sunlight + Fertilizer ^");

        System.out.println();
        drawPlant(week, growthRatePartialFert);
        System.out.println("^ Week " + week + ": " + "Partial Sunlight + Fertilizer ^");

        System.out.println();
        drawPlant(week, growthRateShadedFert);
        System.out.println("^ Week " + week + ": " + "Shaded + Fertilizer ^");

        System.out.println();
        drawPlant(week, growthRateFullNoFert);
        System.out.println("^ Week " + week + ": " + "Full Sunlight + No Fertilizer ^");

        System.out.println();
        drawPlant(week, growthRatePartialNoFert);
        System.out.println("^ Week " + week + ": " + "Partial Sunlight + No Fertilizer ^");

        System.out.println();
        drawPlant(week, growthRateShadedNoFert);
        System.out.println("^ Week " + week + ": " + "Shaded + No Fertilizer ^");

        week = 2;

        System.out.println();
        drawPlant(week, growthRateFullFert);
        System.out.println("^ Week " + week + ": " + "Full Sunlight + Fertilizer ^");

        System.out.println();
        drawPlant(week, growthRatePartialFert);
        System.out.println("^ Week " + week + ": " + "Partial Sunlight + Fertilizer ^");

        System.out.println();
        drawPlant(week, growthRateShadedFert);
        System.out.println("^ Week " + week + ": " + "Shaded + Fertilizer ^");

        System.out.println();
        drawPlant(week, growthRateFullNoFert);
        System.out.println("^ Week " + week + ": " + "Full Sunlight + No Fertilizer ^");

        System.out.println();
        drawPlant(week, growthRatePartialNoFert);
        System.out.println("^ Week " + week + ": " + "Partial Sunlight + No Fertilizer ^");

        System.out.println();
        drawPlant(week, growthRateShadedNoFert);
        System.out.println("^ Week " + week + ": " + "Shaded + No Fertilizer ^");

    }

    // method 1: Calculate
    public static double calculateSunConditions(double growthRate, double sunLevel)
    {
        return growthRate * sunLevel;
    }

    // method 2: calculate growth under different watering conditions - Caitlin
    //for each sunlight condition there are 2 watering conditions waterTop will have an double of .9 and waterBottom will have an int of 1  
    public static double calculateFertilizer(double growthRate, double fertilizer)
    {
        return growthRate + fertilizer;
    }

    public static void drawPlant(int week, double growthRate)
    {
        String boxHoriz = "─";
        String boxVert = "│";
        String boxDownRight = "┌";
        String boxDownLeft = "┐";
        String boxUpRight = "└";
        String boxUpLeft = "┘";
        int totalGrowth = (int) (growthRate * week);

        String bulb = String.format("%s  %s  %s%n%s %s %s %s%n", boxVert, "|", boxVert, boxVert, "\\", "/", boxVert);
        String stem = String.format("%-3s%-3s%s%n", boxVert, "|", boxVert);

        System.out.println(boxDownRight + boxHoriz.repeat(5) + boxDownLeft);
        System.out.print(bulb);
        System.out.print(stem.repeat(totalGrowth));
        System.out.println(boxUpRight + boxHoriz.repeat(5) + boxUpLeft);
    }
}
