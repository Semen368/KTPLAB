public class task1 {
 	
//задание 1: функция, возвращающая остаток от деления a на b	
	public static int remainder(int a, int b){
		int c = a % b;
		return c;
	}
//задание 2: функция, которая принимает основание и высоту треугольника и
//возвращает его площадь
	public static int triArea(int a, int b){
		int area = a * b / 2;
		return area;
	}
//задание 3: функция, возвращающая количество ног среди всех животных. Количество ног у разных видов:
//chickens = 2 legs
//cows = 4 legs
//pigs = 4 legs
	public static int animals(int a,int b, int c) {
		int d = a * 2 + b * 4 + c * 4;
		return d;
	}
//задание 4: функция, которая принимает три аргумента (prob, prize, pay) и
//возвращает true, если prob * prize > pay; в противном случае возвращает false.
	public static boolean profitableGamble(double a, int b, int c){
		if (a * b > c)
			return true;
		else
			return false;
	}
//задание 5: е функцию, которая принимает 3 числа и возвращает, что нужно сделать с
//a и b: они должны быть сложены, вычитаны, умножены или разделены, чтобы
//получить N. Если ни одна из операций не может дать N, вернуть "none".
	public static String operation(int n, int a, int b){
		if (n == a + b)
			return "added";
		else if (n == a - b)
			return "subtraction";
		else if (n == a * b)
			return "multiply";
		else if (n == a / b)
			return "division";
		else 
			return "none";
	}
//задание 6: функция, которая возвращает значение ASCII переданного символа
	public static int ctoa(char c){
		int ascii = c;
		return ascii;
	}
//задание 7: функция, которая берет последнее число из последовательного списка
//чисел и возвращает сумму всех чисел до него и включая его
	public static int addUpTo(int a){
		int b = 0;
		while (a > 0){
			b = b + a;
			a = a - 1;
		}
		return b;
	}
//задание 8: функция, которая находит максимальное значение третьего ребра
//треугольника, где длины сторон являются целыми числами.
	public static int nextEdge(int a, int b){
		int c = a + b - 1;
		return c;
	}
//задание 9: функция, которая принимает массив чисел и возвращает сумму его
//кубов
	public static int sumOfCubes(int[] nums){
		int b = 0;
		int length = nums.length;
		for (int i = 0; i < length; i++)
			b = b + nums[i] * nums[i] * nums[i];
		return b;
	}
//задание 10: функция, которая будет для данного a, b, c выполнять следующие
//действия:
//– Добавить A к себе B раз.
//– Проверить, делится ли результат на C
	public static Boolean abcmath(int a, int b, int c){
		while (b > 0){
			a = a + a;
			b = b - 1;
		}
		if (a % c == 0)
			return true;
		else
			return false;
	}
	public static void main(String[] args){
		int f = remainder(1,5);
		int nums[] = new int[] {1, 5, 9};
		int area = triArea(10,10);
		int an = animals(2,3,5);
		boolean g = profitableGamble(0.2, 50, 9);
		String s = operation(10, 5, 2);
		int ascii = ctoa('D');
		int add = addUpTo(15);
		int edge = nextEdge(8,10);
		int sum = sumOfCubes(nums);
		boolean abccheck = abcmath(42, 5, 10);
		System.out.println("remainder(3,4) -> " + f);
		System.out.println("triArea(10,10) -> " + area);
		System.out.println("animals(2,3,5) -> " + an);
		System.out.println("profitableGamble(0.2, 50, 9) -> " + g);
		System.out.println("operation(10, 5, 2) -> " + s);
		System.out.println("ctoa('D') -> " + ascii);
		System.out.println("addUpTo(15) -> " + add);
		System.out.println("nextEdge(8,10) -> " + edge);
		System.out.println("sumOfCubes([1,10,2]) -> " + sum);
		System.out.println("abcmath(42, 5, 10) -> " + abccheck);
	}
}

