/**
    *This method takes a filename as an argument.
    *The file contains records consisting of:-
    *  location - String
    *  temperature - double
    *  rainfall - int
    *  visibility - String
    *  windspeed - double
    *  
    *  It reads those and writes location and temperature into a sortedMap which it returns.  The remianing data is discarded.
    */
   public SortedMap<String, Double> readTemperature(String filename)
   {
      BufferedReader bufferedFileReader = null;
      SortedMap<String, Double> aTreeMap = new TreeMap<>();
      
      try {
          String location;
          double temperature;
          int rainfall;
          String visibility;
          double windspeed;
          Scanner lineScanner;
          bufferedFileReader = new BufferedReader(new FileReader(filename));
          String currentLine = bufferedFileReader.readLine();
          
          while (currentLine != null) {
              lineScanner = new Scanner(currentLine);
              lineScanner.useDelimiter(",");
              location = lineScanner.next();
              temperature = lineScanner.nextDouble();
              rainfall = lineScanner.nextInt();
              visibility = lineScanner.next();
              windspeed = lineScanner.nextDouble();
              aTreeMap.put(location, temperature);
              currentLine = bufferedFileReader.readLine();
          }
      }
      
        catch (Exception anException){
            SortedMap<String, Double> emptyMap = new TreeMap<>();
            return emptyMap;
          }
      
        finally {
          try{
              bufferedFileReader.close();
          }
          
         catch (Exception anException){
            SortedMap<String, Double> emptyMap = new TreeMap<>();
            return emptyMap;
          }
          
        }
      
      return aTreeMap;
   }

   //Tests
   System.out.println(readTemperature("test1.csv"));
   System.out.println(readTemperature("test.csv"));
   System.out.println(readTemperature("test2.csv"));