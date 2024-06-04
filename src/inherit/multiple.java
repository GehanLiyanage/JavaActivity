package inherit;

public class multiple {

    public class A{

    }

    public class B{

    }

    public interface E{

    }

    public interface F{

    }

    public class H extends A{     //class inherit

    }

    public class C extends A implements E{  //class and interface inherit

    }

    public class D extends B implements F{  //class and interface inherit

    }

    public interface G extends E,F{  //interface to interface inherit


    }


}
