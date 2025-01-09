package oops.inheritance;

public class Hybrid_inheritance {

	// Hybrid_inheritance is a combination of multiple type of inheritance

	// GrandParent class
	class GrandParent{	}

	//Parent class is a sub-class of GrandParent class
	class Parent1 extends GrandParent{ }

	//Child1 class is a sub-class of Parent1 class
	class Child1 extends Parent1{ }

	//Child2 class is a sub-class of Parent1 class
	class Child2 extends Parent1{ }

	//Parent2 class is a sub-class of GrandParent class
	class Parent2 extends GrandParent{ }
}
