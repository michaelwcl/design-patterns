package decorator;

public class Cone extends IceCream
{
    private ConeType coneType;

    public Cone(ConeType coneType)
    {
        this.coneType = coneType;

        if(this.coneType.equals(coneType.SUGAR_CONE))
            this.description = "Sugar Cone";
        else if(this.coneType.equals(coneType.CHOCOLATE_DIPPED_CONE))
            this.description = "Chocalate Dipped Cone";
        else if(this.coneType.equals(coneType.PRETZEL_CONE))
            this.description = "Pretzel Cone";
        else if(this.coneType.equals(coneType.WAFFLE_CONE))
            this.description = "Waffle Cone";
    }

    public double getCost()
    {
        if(this.coneType == coneType.SUGAR_CONE)
            return 0.75;
        else if(this.coneType == coneType.CHOCOLATE_DIPPED_CONE)
            return 1.5;
        else if(this.coneType == coneType.PRETZEL_CONE)
            return 1.8;
        else if(this.coneType == coneType.WAFFLE_CONE)
            return 1.2;
        else 
            return 0.0;
    }
}
