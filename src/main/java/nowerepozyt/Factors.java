package nowerepozyt;

/**
 * Created by RENT on 2017-01-05.
 */
public class Factors {
    int x;
    int y;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (!(obj instanceof Factors))
            return false;

        Factors f = (Factors) obj;

        if(this.x == f.x && this.y == f.y)
            return true;

        return true;

    }

    public void print () {
        System.out.print(getX() + " " + getY());
    }


    public Factors(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
