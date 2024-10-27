import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задание блока 1: ");
        System.out.println("    Задание 1: ");
        System.out.print("      Введите число с дробной частью: ");
        double fractionInput = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.println(main.fraction(fractionInput));

        System.out.println("    Задание 3:  ");
        System.out.print("      Введите символ цифры: ");
        char charInput = scanner.next().charAt(0);
        scanner.nextLine(); 
        System.out.println(main.charToNum(charInput));

        System.out.println("    Задание 5: ");
        System.out.print("      Введите число для проверки на двузначность: ");
        int twoDigitsInput = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println(main.is2Digits(twoDigitsInput));

        System.out.println("    Задание 7: ");
        System.out.print("      Введите три числа (a, b, num) для проверки диапазона: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int num = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println(main.isInRange(a, b, num));

        System.out.println("    Задание 9: ");
        System.out.print("      Введите три числа (a, b, c) для проверки на равенство: ");
        int equalA = scanner.nextInt();
        int equalB = scanner.nextInt();
        int equalC = scanner.nextInt();
        scanner.nextLine();
        System.out.println(main.isEqual(equalA, equalB, equalC));

        System.out.println("Задание блока 2: ");
        System.out.println("    Задание 1: ");
        System.out.print("      Введите число для вычисления модуля: ");
        int absInput = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println(main.abs(absInput));

        System.out.println("    Задание 3: ");
        System.out.print("      Введите число для проверки на кратность 3 или 5: ");
        int is35Input = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println(main.is35(is35Input));

        System.out.println("    Задание 5: ");
        System.out.print("      Введите три числа (x, y, z) для поиска максимума: ");
        int max3X = scanner.nextInt();
        int max3Y = scanner.nextInt();
        int max3Z = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println(main.max3(max3X, max3Y, max3Z));

        System.out.println("    Задание 7: ");
        System.out.print("      Введите два числа (x, y) для суммирования: ");
        int sum2X = scanner.nextInt();
        int sum2Y = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println(main.sum2(sum2X, sum2Y));

        System.out.println("    Задание 9: ");
        System.out.print("      Введите число от 1 до 7 для определения дня недели: ");
        int dayInput = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println(main.day(dayInput));

        System.out.println("Задание блока 3: ");
        System.out.println("    Задание 1: ");
        System.out.print("      Введите число для вывода последовательности: ");
        int listNumsInput = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println(main.listNums(listNumsInput));

        System.out.println("    Задание 3: ");
        System.out.print("      Введите число для вывода четных чисел: ");
        int chetInput = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println(main.chet(chetInput));

        System.out.println("    Задание 5: ");
        System.out.print("      Введите число для подсчета количества цифр: ");
        long numLenInput = scanner.nextLong();
        scanner.nextLine(); 
        System.out.println(main.numLen(numLenInput));

        System.out.println("    Задание 7: ");
        System.out.print("      Введите число для вывода квадрата: ");
        int squareInput = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println(main.square(squareInput));

        System.out.println("    Задание 9: ");
        System.out.print("      Введите число для вывода прямоугольного треугольника: ");
        int rightTriangleInput = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println(main.rightTriangle(rightTriangleInput));

        System.out.println("Задание блока 4: ");
        System.out.println("    Задание 1: ");
        System.out.print("      Введите массив чисел через пробел: ");
        String[] arrInput = scanner.nextLine().split(" ");
        int[] arr = Arrays.stream(arrInput).mapToInt(Integer::parseInt).toArray();
        System.out.print("      Введите число для поиска: ");
        int x = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println(main.findFirst(arr, x));

        System.out.println("    Задание 3: ");
        System.out.print("      Введите массив чисел через пробел: ");
        String[] arr2Input = scanner.nextLine().split(" ");
        int[] arr2 = Arrays.stream(arr2Input).mapToInt(Integer::parseInt).toArray();
        System.out.println(main.maxAbs(arr2));

        System.out.println("    Задание 5: ");
        System.out.print("      Введите первый массив чисел через пробел: ");
        String[] arr6Input = scanner.nextLine().split(" ");
        int[] arr6 = Arrays.stream(arr6Input).mapToInt(Integer::parseInt).toArray();
        System.out.print("      Введите второй массив чисел через пробел: ");
        String[] insInput = scanner.nextLine().split(" ");
        int[] ins = Arrays.stream(insInput).mapToInt(Integer::parseInt).toArray();
        System.out.print("      Введите позицию для вставки: ");
        int pos = scanner.nextInt();
        scanner.nextLine();
        int[] result = main.add(arr6, ins, pos);
        if (result != null) {
            System.out.print("      Ответ: ");
            for (int num2 : result) {
                System.out.print(num2 + " ");
            }
            System.out.println();
        }

        System.out.println("    Задание 7: ");
        System.out.print("      Введите массив чисел через пробел: ");
        String[] arr7Input = scanner.nextLine().split(" ");
        int[] arr7 = Arrays.stream(arr7Input).mapToInt(Integer::parseInt).toArray();
        int[] reversedArr = main.reverseBack(arr7);
        System.out.print("      Ответ: ");
        for (int num3 : reversedArr) {
            System.out.print(num3 + " ");
        }
        System.out.println();

        System.out.println("    Задание 9: ");
        System.out.print("      Введите массив чисел через пробел: ");
        String[] arr5Input = scanner.nextLine().split(" ");
        int[] arr5 = Arrays.stream(arr5Input).mapToInt(Integer::parseInt).toArray();
        System.out.print("      Введите число для поиска: ");
        int xx = scanner.nextInt();
        scanner.nextLine();
        int[] result4 = main.findAll(arr5, xx);
        System.out.print("      Ответ: ");
        for (int index : result4) {
            System.out.print(index + " ");
        }

        scanner.close();
    }

    public String fraction(double x) {
        return "      Входные данные: " + x + ", Ответ: " + (x - (int) x);
    }

    public String charToNum(char x) {
        return "      Входные данные: " + x + ", Ответ: " + (x - '0');
    }

    public String is2Digits(int x) {
        return "      Входные данные: " + x + ", Ответ: " + ((x >= 10 && x <= 99) || (x <= -10 && x >= -99));
    }

    public String isInRange(int a, int b, int num) {
        int min, max;
        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }
        return "      Входные данные: a=" + a + ", b=" + b + ", num=" + num + ", Ответ: " + (num >= min && num <= max);
    }

    public String isEqual(int a, int b, int c) {
        return "      Входные данные: a=" + a + ", b=" + b + ", c=" + c + ", Ответ: " + ((a == b) && (b == c));
    }

    public String abs(int x) {
        int nachalo = x;
        return "      Входные данные: " + nachalo + ", Ответ: " + (x < 0 ? -x : x);
    }

    public String is35(int x) {
        boolean del3 = (x % 3 == 0);
        boolean del5 = (x % 5 == 0);
        return "      Входные данные: " + x + ", Ответ: " + ((del3 || del5) && !(del3 && del5));
    }

    public String max3(int x, int y, int z) {
        int maxXY;
        if (x > y) {
            maxXY = x;
        } else {
            maxXY = y;
        }
        int max = maxXY > z ? maxXY : z;
        return "      Входные данные: x=" + x + ", y=" + y + ", z=" + z + ", Ответ: " + max;
    }

    public String sum2(int x, int y) {
        int sum = x + y;
        return "      Входные данные: x=" + x + ", y=" + y + ", Ответ: " + (sum >= 10 && sum <= 19 ? 20 : sum);
    }

    public String day(int x) {
        String day = switch (x) {
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            case 7 -> "воскресенье";
            default -> "это не день недели";
        };
        return "      Входные данные: " + x + ", Ответ: " + day;
    }

    public String listNums(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            result.append(i).append(" ");
        }
        return "      Входные данные: " + x + ", Ответ: " + result.toString();
    }

    public String chet(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            result.append(i).append(" ");
        }
        return "      Входные данные: " + x + ", Ответ: " + result.toString();
    }

    public String numLen(long x) {
        long stroka = x;
        int count = 0;
        if (x == 0) {
            return "      Входные данные: " + x + ", Ответ: 1";
        }
        if (x < 0) {
            x = -x;
        }

        while (x > 0) {
            x /= 10;
            count++;
        }
        return "      Входные данные: " + stroka + ", Ответ: " + count;
    }

    public String square(int x) {
        StringBuilder result = new StringBuilder();
        result.append("      Входные данные: ").append(x).append(", Ответ: \n");
        for (int i = 0; i < x; i++) {
            result.append("          ");
            for (int j = 0; j < x; j++) {
                result.append("*");
            }
            result.append("\n");
        }
        return result.toString();
    }

    public String rightTriangle(int x) {
        StringBuilder result = new StringBuilder();
        result.append("      Входные данные: ").append(x).append(", Ответ: \n");
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                result.append(" ");
            }
            result.append("          ");
            for (int k = 0; k < i; k++) {
                result.append("*");
            }
            result.append("\n");
        }
        return result.toString();
    }

    public String findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return "      Входные данные: массив=" + Arrays.toString(arr) + ", число=" + x + ", Ответ: " + i;
            }
        }
        return "      Входные данные: массив=" + Arrays.toString(arr) + ", число=" + x + ", Ответ: -1";
    }

    public String maxAbs(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(max)) {
                max = arr[i];
            }
        }
        return "      Входные данные: массив=" + Arrays.toString(arr) + ", Ответ: " + max;
    }

    public int[] add(int[] arr, int[] ins, int pos) {
        if (pos < 0 || pos > arr.length) {
            return new int[0];
        }
        int[] newArray = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, newArray, 0, pos);
        System.arraycopy(ins, 0, newArray, pos, ins.length);
        System.arraycopy(arr, pos, newArray, pos + ins.length, arr.length - pos);

        return newArray;
    }

    public int[] reverseBack(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (num == x) {
                count++;
            }
        }
        int[] indices = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indices[index++] = i;
            }
        }

        return indices;
    }
}
