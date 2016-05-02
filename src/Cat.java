public class Cat
{
    private Double originWeight;
    private Double weight;
    private Double minWeight;
    private Double maxWeight;
    private static Integer count = 0;
    private Double foodWeight =0.0;
    private Integer timesMeow=0;

    //Статический метод.
    public  static  Integer getCount()
    {
        return count;
    }

    public Cat()
    {
        this( 1500.0 + 3000.0 * Math.random());
    }

    public  Cat(Double weight)
    {
        minWeight = 100.0;
        maxWeight = 9000.0;
        /* Проверку на вес не делаем - разрешаем создание мёртвых кошек
        if(weight < minWeight || weight > maxWeight)
        {
            weight = getRandomDouble(1500.0, 3000.0);
        }
        else
        {*/
            this.weight = weight;
            originWeight = weight;
        //}
        count++;
    }
    //this consntructor for creating kittens only
    private Cat(Double weight,Double minWeight, Double maxWeight)
    {
        this.weight =weight;
        this.originWeight = weight;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        count++;
    }
       public static Cat getKitten()
       {
           Cat kitten = new Cat(getRandomDouble(100.0,100.0),100.0,200.0);
            return kitten;
       }
    //вместо заполнения экрана воплями кота,
    // лучше подсчитаем сколько раз он мяукнул
    public  void meow()
    {
        //если кошка жива меняем её вес(уменьшаем вес на 1 грамм)
            if(setWeight(weight-1))
            {
                timesMeow++;//мяукаем 1 раз
                //Вес уменьшен, теперь снова проверка( текущий вес кошки меньше минимального?)
                if(weight < minWeight)
                {
                    count--;
                    System.out.println(" The  some cat said" + " <Meow> for "  + timesMeow + " times");
                }
            }
            else
            {
                CatIsNotAliveMessage();
            }
    }



    public void feed(Double amount)
    {
        if(setWeight(weight + amount))
        {
            foodWeight = foodWeight + amount;
            if(weight > maxWeight)
            {
                count--;
            }
        }
        else
        {
            CatIsNotAliveMessage();
        }

    }

    public void drink(Double amount)
    {
        if(setWeight(weight + amount))
        {
            if(weight > maxWeight)
            {
                count--;
            }
        }
        else
        {
            CatIsNotAliveMessage();
        }
    }

    public void toilet(Double ballast)
    {
        if(setWeight(weight - ballast))
        {
            System.out.println(" Кто то из кошаков облегчился ))");
            if(weight < minWeight)
            {
                count--;
            }
        }
        else
        {
            CatIsNotAliveMessage();
        }
    }

    public Double getWeight()
    {
        return weight;
    }

    //масса съеденной пищи
    public Double getFoodWeight()
    {
        return foodWeight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public static Cat createTwin(Cat cat) {
        Cat twin = new Cat();
        twin.setWeight(cat.getWeight());
        twin.originWeight = twin.weight;
        return  twin;
    }

    private boolean setWeight(Double weight)
    {
        if(isAlive())
        {
            this.weight = weight;
            return true;
        }
        return false;
    }
    //================  Methods added by me ============
    private void CatIsNotAliveMessage() {
        System.out.println("This cat is not alive");
    }
    public static Double getRandomDouble(Double from, Double to)
    {
        //TODO isDouble()??
        Double result = from + (to * Math.random());
        return result;
    }
    public boolean isAlive()
    {
        if ((weight < minWeight) || (weight > maxWeight))
        {
            return false;
        }
        else
        {
            return  true;
        }
    }
}//end class