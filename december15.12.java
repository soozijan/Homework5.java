Scanner scanner = new Scanner(System.in);
  //Targil 1:

        int number = -1000;
        do   {
            System.out.println(number);
           number ++;
        }
        while (number <= 1000);


        //Targil 2:
        int oreh, rohav , hekef;
        int correct;   //( I'll glad if you can explain me why i have to write correct here)
        do {
            System.out.println("please enter a number for oreh, rohav , hekef ");
            oreh = scanner.nextInt();
            rohav = scanner.nextInt();
            hekef = scanner.nextInt();
            correct = oreh * 2 + rohav * 2;
        }

       while (hekef != oreh * 2 + rohav * 2);



       //Targil 3:
    //1    int number_wt = -1000;
        while (true)
            System.out.println(number_wt);
            number ++;
             if (number_wt > 1000) {
                 break;




                 int oreh_wt, rohav_wt , hekef_wt;
     //2            int correct_wt;
                 do {
                     System.out.println("please enter a number for oreh_wt, rohav_wt , hekef_wt ");
                     oreh_wt = scanner.nextInt();
                     rohav_wt = scanner.nextInt();
                     hekef_wt = scanner.nextInt();
                     correct_wt = oreh * 2 + rohav * 2;
                     if (hekef_wt == correct_wt) {
                         break;
                     }
                 }

                 while (true);


                 //Targil 4 :
                float temperature;
                while (true)   {
                    System.out.println("Please Enter a number for temperature: " );
                    temperature = scanner.nextFloat();
                    if (temperature < 35 || temperature > 42) {
                        System.out.println("out of range");
                        break;
                    }
                    if (temperature > 37.5 && temperature <= 42) {
                        System.out.println("sick");
                    }
                    else {
                        System.out.println("Healthy");
                    }
                    }
