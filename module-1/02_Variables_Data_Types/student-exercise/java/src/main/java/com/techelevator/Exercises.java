package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */

		int woodsRaccoons = 3;
		int hungryRaccoons = 2;
		int totalRaccoons = woodsRaccoons - hungryRaccoons;
		System.out.println(totalRaccoons);
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */

		int flowers = 5;
		int bees = 3;
		int howManyBees = flowers - bees;
		System.out.println(howManyBees);
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */

		int lonelyPigeon = 1;
		int hungryPigeon = 1;
		int totalPigeon = lonelyPigeon + hungryPigeon;
		System.out.println(totalPigeon);
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */

		int fenceOwls = 3;
		int newOwls = 2;
		int totalOwls = fenceOwls + newOwls;
		System.out.println(totalOwls);
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */

		int homeBeavers = 2;
		int swimBeavers = 1;
		int workingBeavers = homeBeavers - swimBeavers;
		System.out.println(workingBeavers);
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */

		int treeToucan = 2;
		int newToucan = 1;
		int totalToucan = treeToucan + newToucan;
		System.out.println(totalToucan);
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */

		int squirrels = 4;
		int nuts = 2;	
		int moreSquirrelsThanNuts = squirrels - nuts;
		System.out.println(moreSquirrelsThanNuts);
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */

		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int nickelTwo = 5;
		int totalPennies = quarter + dime + nickel + nickelTwo;
		System.out.println(totalPennies);		
		
				
		
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */

		int brierMuffins = 18;
		int macAdamsMuffins = 20;
		int flanneryMuffins = 17;
		int totalMuffins = brierMuffins + macAdamsMuffins + flanneryMuffins;
		System.out.println(totalMuffins);	
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */

		int yoyo = 24;
		int whistle = 14;
		int totalCentsSpent = yoyo + whistle;
		System.out.println(totalCentsSpent);
		
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */

		int largeMarshmallows = 8;
		int smallMarshmallows =  10;
		int totalMarshmallows = largeMarshmallows + smallMarshmallows;
		System.out.println(totalMarshmallows);
				
		
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */

		int hiltSnow = 29;
		int brecknockSnow = 17;
		int moreInches = hiltSnow - brecknockSnow;
		System.out.println(moreInches);
		
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */

		int startMoney = 1000;
		int truck = 300;
		int pencilCase = 200;
		int hiltMoney = startMoney - truck - pencilCase;
		System.out.println(hiltMoney);
		
		
		
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */

		int startCollection = 16;
		int lostCollection = 7;
		int totalCollection = startCollection - lostCollection;
		System.out.println(totalCollection);
		
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		
		int meganShells = 19;
		int wantedShells = 25;
		int neededShells = wantedShells - meganShells;
		System.out.println(neededShells);
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

		int bradBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = bradBalloons - redBalloons;
		System.out.println(greenBalloons);
		
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

		int startingBooks = 38;
		int addedBooks = 10;
		int totalBooks = startingBooks + addedBooks;
		System.out.println(totalBooks);
		
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

		int beeLegs = 6;
		int numberOfBees = 8;
		int totalLegs = beeLegs * numberOfBees;
		System.out.println(totalLegs);
		
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */

		int coneCost = 99;
		int numberOfCones = 2;
		int totalCost = coneCost * numberOfCones;
		System.out.println(totalCost);
			
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */

		int currentRocks = 64;
		int neededRocks = 125;
		int moreRocks = neededRocks - currentRocks;
		System.out.println(moreRocks);
		
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */

		int startMarbles = 38;
		int lostMarbles = 15;
		int totalMarbles = startMarbles - lostMarbles;
		System.out.println(totalMarbles);
		
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

		int milesToConcert = 78;
		int milesToGas = 32;
		int milesToGo = milesToConcert - milesToGas;
		System.out.println(milesToGo);
		
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */

		int timeMorning = 90;
		int timeAfternoon = 45;
		int totalTime = timeMorning + timeAfternoon;
		System.out.println(totalTime);
		
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

		int hotDogCost = 50;
		int numberOfHotDogs = 6;
		int totalCostHotDogs = hotDogCost * numberOfHotDogs;
		System.out.println(totalCostHotDogs);
		
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */

		int pencilCost = 7;
		int availibleMoney = 50;
		int pencilsBought = availibleMoney / pencilCost;
		System.out.println(pencilsBought);
		
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		
		int butterfliesSaw = 33;
		int butterfliesOrange = 20;
		int butterfliesRed = butterfliesSaw - butterfliesOrange;
		System.out.println(butterfliesRed);

        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

		int givenMoney = 100;
		int candyCost = 54;
		int moneyBack = givenMoney - candyCost;
		System.out.println(moneyBack);
		
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

		int startingTrees = 13;
		int plantedTrees = 12;
		int totalTrees = startingTrees + plantedTrees;
		System.out.println(totalTrees);
		
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */

		int numberOfHoursInDay = 24;
		int numberOfDaysUntilGrandma = 2;
		int numberOfHoursUntilGrandma = numberOfHoursInDay * numberOfDaysUntilGrandma;
		System.out.println(numberOfHoursUntilGrandma);
		
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */

		int numberOfCousins = 4;
		int numberOfSticks = 5;
		int howMuchGum = numberOfCousins * numberOfSticks;
		System.out.println(howMuchGum);
		
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

		int startMoneyDan = 300;
		int candyPrice = 100;
		int moneyLeft = startMoneyDan - candyPrice;
		System.out.println(moneyLeft);
		
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */

		int boatsOnLake = 5;
		int peoplePerBoat = 3;
		int totalPeople = boatsOnLake * peoplePerBoat;
		System.out.println(totalPeople);
		
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */

		int startingLegos = 380;
		int lostLegos = 57;
		int totalLegos = startingLegos - lostLegos;
		System.out.println(totalLegos);
		
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */

		int bakedMuffins = 35;
		int wantedMuffins = 83;
		int howManyMuffins = wantedMuffins - bakedMuffins;
		System.out.println(howManyMuffins);
		
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

		int willyCrayons = 1400;
		int lucyCrayons = 290;
		int moreCrayons = willyCrayons - lucyCrayons;
		System.out.println(moreCrayons);
		
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */

		int stickersPerPage = 10;
		int pagesOfStickers = 22;
		int totalStickers = stickersPerPage * pagesOfStickers;
		System.out.println(totalStickers);
		
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */

		int totalCupcakes = 96;
		int totalChildren = 8;
		int cupcakesPerChild = totalCupcakes / totalChildren;
		System.out.println(cupcakesPerChild);
		
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */

		int totalCookies = 47;
		int cookiesPerJar = 6;
		int cookiesLeftOut = totalCookies % cookiesPerJar;
		System.out.println(cookiesLeftOut);
		
		
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

		int totalCroissants = 59;
		int numberOfNeighbors = 8;
		int leftOverCroissants = totalCroissants % numberOfNeighbors;
		System.out.println(leftOverCroissants);
		
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */

		int cookiesPerTray = 12;
		int neededCookies = 276;
		int neededTrays = neededCookies / cookiesPerTray;
		System.out.println(neededTrays);
		
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

		int pretzelBite = 480;
		int pretzelServing = 12;
		int totalServings = pretzelBite / pretzelServing;
		System.out.println(totalServings);
		
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

		int totalLemonCupcakes = 53;
		int cupcakesPerBox = 3;
		int cupcakesAtHome = 2;
		int boxesGiven = totalLemonCupcakes / cupcakesPerBox - cupcakesAtHome;
		System.out.println(boxesGiven);
		
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */

		int carrotSticks = 74;
		int numberOfPeople = 12;
		int uneatenCarrots = carrotSticks % numberOfPeople;
		System.out.println(uneatenCarrots);
		
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		
		int totalBears = 98;
		int bearsPerShelf = 7;
		int numberOfShelves = totalBears / bearsPerShelf;
		System.out.println(numberOfShelves);

        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

		int totalPictures = 480;
		int picturesPerAlbum = 20;
		int neededAlbums = totalPictures / picturesPerAlbum;
		System.out.println(neededAlbums);
		
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

		int totalCards = 94;
		int cardsPerBox = 8;
		int neededBoxes = totalCards / cardsPerBox;
		int cardsLeft = totalCards % cardsPerBox;
		System.out.println(neededBoxes);
		System.out.println(cardsLeft);
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

		int totalSusieBooks = 210;
		int totalShelves = 10;
		int booksPerShelf = totalSusieBooks / totalShelves;
		System.out.println(booksPerShelf);
		
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

		double totalCristinaCroissants = 17;
		double totalGuests = 7;
		double croissantsPerGuest =  totalCristinaCroissants / totalGuests;
		System.out.println(croissantsPerGuest);
		
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		double singleRoom = 1;
		double billTimePerRoom = 2.15;
		double jillTimePerRoom = 1.90;
		double billHourlyRate = singleRoom / billTimePerRoom;
		double jillHourlyRate = singleRoom / jillTimePerRoom;
		double combinedHourlyRate = billHourlyRate + jillHourlyRate;
		double timeForFiveRooms = combinedHourlyRate * 5;
		System.out.println(timeForFiveRooms);
		double allTheRooms = combinedHourlyRate * 623;
		double numberOfHours = allTheRooms / 8;
		System.out.println(numberOfHours);
		
		
		
		
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

		String firstName = "Alexander";
		String lastName = "Bennett";
		String middleInitial = "A";
		String comma = ", ";
		String period = ". ";
		String fullname = lastName + comma + firstName + comma + middleInitial + period;
				System.out.println(fullname);
		
				
		
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */

		double totalTrip = 800;
		double tripCompleted = 537;

		double percentComplete = tripCompleted / totalTrip * 100;
		System.out.println(percentComplete);
				

	}

}
