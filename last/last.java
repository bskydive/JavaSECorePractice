package com.javarush.test.last;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;


public class last
{

//    try{
//    date = new SimpleDateFormat("dd MM yyyy").parse(midStr[maxInd-3]+" "+midStr[maxInd-2]+" "+midStr[maxInd-1] );
//    map.put(name, date);
//}catch (ParseException e)
//    {
//    }

// ================================================================================================================
//do not forget create FileTooBigException.class!

    public byte[] read(File file) throws IOException, FileTooBigException {
        long MAX_FILE_SIZE = Long.MAX_VALUE;

        if ( file.length() > MAX_FILE_SIZE ) {
            throw new FileTooBigException(file);
        }


        byte []buffer = new byte[(int) file.length()];
        InputStream ios = null;
        try {
            ios = new FileInputStream(file);
            if ( ios.read(buffer) == -1 ) {
                throw new IOException("EOF reached while trying to read the whole file");
            }
        } finally {
            try {
                if ( ios != null )
                    ios.close();
            } catch ( IOException e) {
            }
        }

        return buffer;
    }

    public static void read1() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    FileInputStream input = new FileInputStream(reader.readLine());
    int max = 0;
    while (input.available()>0){
    if(max < input.read()){
        max = input.read();
    }
}
    reader.close();
    input.close();
    System.out.println(max);
}

// ================================================================================================================

//    private static final int USED = Integer.MAX_VALUE;
//
//    public static void printCombinationArray(String[] inputArray, Stack<String> stackItems, int itemsCount) {
//        if (itemsCount == 0) {
//            System.out.println(Arrays.toString(stackItems.toArray()));
//            return;
//        }
//        for (int i = 0; i < inputArray.length; i++) if (inputArray[i] != USED) {
//            stackItems.push(inputArray[i]);
//            inputArray[i] = USED;
//            printCombinationArray(inputArray, stackItems, itemsCount - 1);
//            inputArray[i] = stackItems.pop();
//        }
//    }

        private static final String USED = "STACK_USED";

        public static String arrayToString(Object[] inputObject) {
            if (inputObject == null)
                return "null";

            int iMax = inputObject.length - 1;
            if (iMax == -1)
                return "";

            StringBuilder b = new StringBuilder();
            for (int i = 0; ; i++) {
                b.append(String.valueOf(inputObject[i]));
                if (i == iMax)
                    return b.append("").toString();
            }
        }

        public static void printCombinationSingleString(String[] inputArray, Stack<String> stackItems, int itemsCount) {
            if (itemsCount == 0) {
                System.out.println(arrayToString(stackItems.toArray()));
                return;
            }
            for (int i = 0; i < inputArray.length; i++) if (inputArray[i] != USED) {
                stackItems.push(inputArray[i]);
                inputArray[i] = USED;
                printCombinationSingleString(inputArray, stackItems, itemsCount - 1);
                inputArray[i] = stackItems.pop();
            }
        }

    private String ReadFileStrings(String sourceFileName)
    {

        FileInputStream input=null;
        Scanner fileReader= null;
        String stringsFromFile="";

        try{
            fileReader = new Scanner(new File(sourceFileName));
            if (fileReader.hasNext()) stringsFromFile = fileReader.nextLine();
            while (fileReader.hasNext()) stringsFromFile += " " +fileReader.nextLine();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally
        {
            fileReader.close();
        }

        return stringsFromFile;
    }


        public static void main(String[] args) {

            //        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElementelement : stackTraceElements)
//        System.out.println(element.getMethodName());

            long sum = 1;
            String outStr = "1";
            System.out.println(sum);
            for (int i = 2; i <= 10 ; i++) {
                sum=sum+i;
                outStr = outStr + "+" + i;
                System.out.println(outStr + "=" + sum);
            }
            System.out.println("???");
            System.out.println("世界您好!");
//        String str1 = System.getenv("JAVA_BINDIR");
            String javaHome = System.getProperty("java.home");
//        java.nio.file.Path x = java.nio.file.Paths.get(str);
//                new java.nio.file.Path();
            String fileSeparator = System.getProperty("file.separator");
            System.out.println(javaHome + fileSeparator + "bin" + fileSeparator + "java.exe");

            String rainbowColours[] = {"красный", "оранжевый", "желтый", "зеленый", "голубой", "синий", "фиолетовый"};

//        int i = 0;
//        int j = 0;
//        do  {
//            j = 1;
//            do {
//                System.out.print(rainbowColours[i] + " ");
//                i++;
//                j++;
//            } while (j<=3 & i <=6);
//            System.out.println("");
//        } while (i<=6);

//        int i = 1;
//        int j = 1;
//        int res = 0;
//        do  {
//            j = 1;
//            do {
//                res = i*j;
//                System.out.print(res + " ");
//                j++;
//            } while (j<=10 & i <=10);
//            System.out.println("");
//            i++;
//        } while (i<=10);


//		int mask = 0;
//		int limit = 1 << strMass.length;
//		while (mask < limit) {
//			//
//            System.out.print("(");
//            for (int i = 0; i < strMass.length; i++) {
//                //печатаем i-й элемент массива
//                if ((mask & (1 << i)) != 0) {
//                    System.out.print(strMass[i] + ",");
//                }
//            }
//            System.out.println(")");
//            //
//			mask++;
//		}



            //printCombinationArray(strMass, new Stack<String>(), 3);
            String strMass[] = {"Мама", "Мыла", "Раму"};
            printCombinationSingleString(strMass, new Stack<String>(), 3);


//    int am = 3;
//    Stack<Integer> s = new Stack<Integer>();
//    int[] arr = new int[]{1,2,3,4};
//import java.io.IOException;
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String inputName1 = inputReader.readLine();
                String inputName2 = inputReader.readLine();
                String inputName3 = inputReader.readLine();
                System.out.println(inputName1+" + "+inputName2+" + "+inputName3+" = Чистая любовь, да-да!");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


////    package com.javarush.test.level08.lesson08.task05;
//
//
//
///* Удалить людей, имеющих одинаковые имена
//Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
//Удалить людей, имеющих одинаковые имена.
//*/
//
//    public class Solution
//    {
//
//        import java.util.HashMap;
//        import java.util.Iterator;
//        import java.util.Map;
//
//        public static void main(String[] args){
//
//            HashMap<String,String> newMap = createMap();
//            printMap(newMap);
//            removeTheFirstNameDuplicates(newMap);
//            System.out.println();
//            printMap(newMap);
//        }
//
//        public static void printMap(HashMap<String, String> map){
//
//            for (Map.Entry<String,String> pair: map.entrySet()){
//                System.out.println(pair.getKey() + " - " + pair.getValue());
//            }
//        }
//
//        public static HashMap<String, String> createMap()
//        {
//            HashMap<String,String> createdMap = new HashMap<String, String>();
//
//            for (int i=0;i<5;i++) {
//                createdMap.put("Ivanov" + i, "Ivan" + i);
//                createdMap.put("Petrov" + i, "Ivan" + i);
//            }
//
//            return createdMap;
//
//        }
//
//        public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
//        {
//            HashMap<String,String> copiedMap = new HashMap<String, String>(map);
//
//            for (Map.Entry<String,String> pair: copiedMap.entrySet()){
//                String copiedMapValue = pair.getValue();
//                removeItemFromMapByValue(map,copiedMapValue);
//            }
//        }
//
//        public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
//        {
//
//            Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
//
//            int repeatCount=0;
//
//            while (it.hasNext()) {
//                String mapValue = it.next().getValue();
//
//                if (mapValue.equals(value)) {
//                    if (repeatCount>0 ){
//                        it.remove();
//                        System.out.println("remove:" + mapValue);
//                    } else repeatCount++;
//                }
//            }
//        }
//    }


}
