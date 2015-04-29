
public class GoodsApp {
	public static void main(String[] args) {
		Goods camera0 = new Goods();
		Goods camera = new Goods("Nikon",40000,30,50);
		
		System.out.print("상품이름:");
		System.out.println(camera.getName());
		System.out.print("상품가격:");
		System.out.println(camera.getPrice());
		System.out.print("재고수량:");
		System.out.println(camera.getCountStock());
		System.out.print("팔린수량:");
		System.out.println(camera.getCountSold());
	}
}
