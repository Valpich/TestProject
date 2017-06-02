package iit.test.valentinpichavant;

/**
 * The Class VendingMachine.
 */
public class VendingMachine
{
    
    /** The current state. */
    private int x;
    
    /** The current price. */
    private int price;
    
    /** The current number of large cups. */
    private int k;
    
    /** The current number of small cups. */
    private int k1;
    
    /** The the current value inserted. */
    private int t;
    
    /** The size of the cup choosen, 1 if large, 2 if small, nothing otherwise. */
    private int s;

    /**
     * Instantiates a new vending machine.
     */
    public VendingMachine()
    {
        k1 = 0;
        k = 0;
        t = 0;
        price = 0;
        x = 1;
    }
    
    /**
     * Coin.
     *
     * @return the result of coin, 1 if transition executed else 0
     */
    public final int coin()
    {
        if (x == 1)
        {
            if ((t + 25 >= price) && (price > 0))
            {
                s = 0;
                t = 0;
                x = 2;
                return 1;
            }
            else if (t + 25 < price)
            {
                t = t + 25;
                return 1;
            }
        }
        else if ((x > 1) && (x < 6))
        {
            System.out.print("RETURN COIN");
            System.out.print("\n");
            return 1;
        }
        return 0;
    }
    
    /**
     * Small cup.
     *
     * @return the result of small_cup, 1 if transition executed else 0
     */
    public final int small_cup()
    {
        if ((x == 2) || (x == 3))
        {
            s = 2;
            return 1;
        }
        return 0;
    }
    
    /**
     * Large cup.
     *
     * @return the result of large_cup, 1 if transition executed else 0
     */
    public final int large_cup()
    {
        if ((x == 2) || (x == 3))
        {
            s = 1;
            return 1;
        }
        return 0;
    }
    
    /**
     * Sugar.
     *
     * @return the result of sugar, 1 if transition executed else 0
     */
    public final int sugar()
    {
        if ((x == 2) || (x == 3))
        {
            if (x == 2)
            {
                x = 3;
            }
            else
            {
                x = 2;
            }
            return 1;
        }
        return 0;
    }
    
    /**
     * Tea.
     *
     * @return the result of tea, 1 if transition executed else 0
     */
    public final int tea()
    {
        if ((x == 2) || (x == 3))
        {
            if ((x == 2) && (k1 > 1) && (s == 2))
            {
                System.out.print("DISPOSE SMALL CUP OF TEA");
                System.out.print("\n");
                k1 = k1 - 1;
                x = 1;
                return 1;
            }
            else if ((x == 2) && (k > 1) && (s == 1))
            {
                System.out.print("DISPOSE LARGE CUP OF TEA");
                System.out.print("\n");
                k = k - 1;
                x = 1;
                return 1;
            }
            else if ((x == 2) && (k == 1) && (s == 1))
            {
                System.out.print("DISPOSE LARGE CUP OF TEA");
                System.out.print("\n");
                k = k - 1;
                x = 5;
                return 1;
            }
            else if ((x == 2) && (k1 == 1) && (s == 2))
            {
                System.out.print("DISPOSE SMALL CUP OF TEA");
                System.out.print("\n");
                k1 = k1 - 1;
                x = 4;
                return 1;
            }
            else if ((x == 3) && (k1 == 1) && (s == 2))
            {
                System.out.print("DISPOSE SMALL CUP OF TEA WITH SUGAR");
                System.out.print("\n");
                k1 = k1 - 1;
                x = 4;
                return 1;
            }
            else if ((x == 3) && (k == 1) && (s == 1))
            {
                System.out.print("DISPOSE LARGE CUP OF TEA WITH SUGAR");
                System.out.print("\n");
                k = k - 1;
                x = 5;
                return 1;
            }
            if ((x == 3) && (k1 > 1) && (s == 2))
            {
                System.out.print("DISPOSE SMALL CUP OF TEA WITH SUGAR");
                System.out.print("\n");
                k1 = k1 - 1;
                x = 1;
                return 1;
            }
            else if ((x == 3) && (k > 1) && (s == 1))
            {
                System.out.print("DISPOSE LARGE CUP OF TEA WITH SUGAR");
                System.out.print("\n");
                k = k - 1;
                x = 1;
                return 1;
            }
            return 0;
        }
        return 0;
    }
    
    /**
     * Insert large cups.
     *
     * @param n the amount of large cups to be added
     * @return the result of insert_large_cups, 1 if transition executed else 0
     */
    public final int insert_large_cups(int n)
    {
        if ((x == 1) && (n > 0))
        {
            k = k + n;
            return 1;
        }
        else if ((x == 5) && (n > 0))
        {
            k = n;
            x = 1;
            return 1;
        }
        return 0;
    }
    
    /**
     * Insert small cups.
     *
     * @param n the amount of small cups to be added
     * @return the result of small_cup, 1 if transition executed else 0
     */
    public final int insert_small_cups(int n)
    {
        if ((x == 1) && (n > 0))
        {
            k1 = k1 + n;
            return 1;
        }
        else if ((x == 4) && (n > 0))
        {
            k1 = n;
            x = 1;
            return 1;
        }
        return 0;
    }
    
    /**
     * Sets the price.
     *
     * @param p the new price for the vending machine
     * @return the result of set_price, 1 if transition executed else 0
     */
    public final int set_price(int p)
    {
        if ((x == 1) && (p > 0))
        {
            price = p;
            return 1;
        }
        return 0;
    }
    
    /**
     * Cancel.
     *
     * @return the result of cancel, 1 if transition executed else 0
     */
    public final int cancel()
    {
        if ((x == 2) || (x == 3))
        {
            System.out.print("RETURN COINS");
            System.out.print("\n");
            x = 1;
            return 1;
        }
        return 0;
    }
    
    /**
     * Dispose.
     *
     * @return the result of dispose, 1 if transition executed else 0
     */
    public final int dispose()
    {
        if ((x == 1))
        {
            System.out.print("SHUT DOWN");
            System.out.print("\n");
            x = 6;
            return 1;
        }
        return 0;
    }
}