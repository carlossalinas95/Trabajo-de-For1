
public class ShortcutsMath{
	public static void main(String[] args) {
		int x = 5;
		//a = a + 1
		x++;
		System.out.println("x++: "+x);//6
		++x;
		System.out.println("++x: "+x);//7
		int y = x++;
		System.out.println("y = x++: "+y);
		y = ++x;
		System.out.println("y = ++x: "+y);
		int z = 3;
		System.out.println(z++); // 3
		System.out.println(++z); // 5

		//a = a - 1
		z--;
		System.out.println("z--: "+z);//4
		--z;
		System.out.println("--z: "+z);//3
		//a = a + num
		z += x;
		System.out.println("z+=x: "+z);//12
		// a = a * num
		z *= x;
		System.out.println("z*=x: "+z);//108
		// a = a / num
		z /= x;
		System.out.println("z/=x: "+z);//12
		// a = a % num
		z %= x;
		System.out.println("z%=x: "+z);//3
		//a = a - num
		z -= x;
		System.out.println("z-=x: "+z);//-6


		
		
	}
}