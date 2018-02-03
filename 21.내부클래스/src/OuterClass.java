public class OuterClass {
	// 멤버변수
	public int outer_member_field = 9999;

	// 멤버메쏘드
	public void outer_method() {
		System.out.println("outer_method()");
	}

	/*
	 * InnerClass객체 참조변수
	 */
	// private InnerClass ic_ref;

	/*
	 * 외부클래스(객체)에서 내부클래스를 사용한객체생성-->사용
	 */
	public void outer_inner_use() {
		InnerClass ic = new InnerClass();
		ic.inner_member_field = 745238;
		ic.inner_method();

		// this.ic_ref=new InnerClass();

	}

	// inner(멤버)클래스
	public class InnerClass {
		public int inner_member_field = 8888;

		public void inner_method() {
			System.out.println("inner_method()--> inner_member_field:"
					+ InnerClass.this.inner_member_field);
		}

		/*
		 * << 내부클래스 만드는 이유 >>내부클래스(객체) 에서 외부클래스(객체) 의 멤버접근(사용)
		 */
		public void inner_outer_access() {
			System.out.println("1.inner class-->outer member access:"
					+ OuterClass.this.outer_member_field);
			System.out.println("2.inner class-->outer member access:"
					+ outer_member_field);
			outer_method();
		}

	}

	public void outer_method_익명_로컬_내부_클래스() {
		/*********************/
		ObjectChild oc0 = new ObjectChild();
		System.out.println(oc0.toString());
		oc0.bbb();

		Object oc1 = new Object() {
			public void aaa() {
				System.out.println("oc1.aaa()");
			}

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "헤헤헤";
			}
		};
		System.out.println(oc1.toString());
		// oc1.aaa();

		Object oc2 = new Object() {
			public void ccc() {
				System.out.println("oc2.ccc()");
			}

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "하하하";
			}
		};

	}

	/************ inner(멤버)클래스 ******************/
	public class ObjectChild extends Object {
		public void bbb() {
			System.out.println("ObjectChild.bbb()...");
		}

		@Override
		public String toString() {
			return "난 이름있는 클래스";
		}

	}

}