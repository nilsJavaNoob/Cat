public class Loader {
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        Cat deadCat = new Cat(15000.0);
        System.out.println("Count " + Cat.getCount());
        cat.feed(15000.0);
        System.out.println("Count " + Cat.getCount());
        cat.meow();
        deadCat.meow();
        System.out.println("Count " + Cat.getCount() + "but his status is " + deadCat.getStatus());

        /*
        Cat murzik = new Cat();
        Cat vaska = new Cat();
        Cat murka = new Cat();
        Cat barsik = new Cat();
        Cat zevs = new Cat();
        //Создаём глубокую копию Зевса
        Cat zevsTwin = Cat.createTwin(zevs);
        Cat fifa = new Cat();
        Cat kitten = Cat.getKitten();
        System.out.println("count = " + Cat.getCount());
        Cat first = new Cat(9000.0);
        System.out.println("count = " + Cat.getCount());
        first.feed(2.0);
        System.out.println("count = " + Cat.getCount());
        Cat second = Cat.createTwin(first);
        System.out.println("count = " + Cat.getCount() + " but the second cat is " + second.getStatus());
        //===========
        System.out.println("Added cats");
        Cat ktty = new Cat();
        System.out.println("Added kitty");
        Cat smallKitty = new Cat(200.0);
        Cat bigCat = new Cat(9000.0);
        System.out.println("создаём мёртвую кошку");
        Cat deadCat = new Cat(15000.0);

        System.out.println("Сейчас " + Cat.getCount() + " кошек!");

        System.out.println("kitty weight is " + ktty.getWeight().intValue());
        System.out.println("Фантом deadCat пытается мяукать"  );
        deadCat.meow();

        while(ktty.isAlive())
        {
            ktty.feed(300.0);
        }
        System.out.println("ktty status" + ktty.getStatus());
        while (bigCat.isAlive())
        {
            bigCat.drink(50.0);
        }
        System.out.println("big Cat is" + bigCat.getStatus());
        System.out.println("The kitty is trying to meow, but her status is " + ktty.getStatus());
        ktty.meow();
        while (smallKitty.isAlive())
        {
            smallKitty.toilet(10.0);
        }
        System.out.println("The bigCat is trying to eat, but his status is " + bigCat.getStatus());
        bigCat.feed(1000.0);


        //===========
        System.out.println("cat`s weight " + cat.getWeight().intValue());
        System.out.println("murzik`s weight " + murzik.getWeight().intValue());
        System.out.println("vaska`s weight " + vaska.getWeight().intValue());
        System.out.println("barsik`s weight " + barsik.getWeight().intValue());
        System.out.println("murka`s weight " + murka.getWeight().intValue());
        System.out.println("zevs`s weight " + zevs.getWeight().intValue());
        System.out.println("fifa`s weight " + fifa.getWeight().intValue());
        System.out.println("zevsTwIn`s weight " + zevsTwin.getWeight().intValue());
        System.out.println("kitten`s weight " + kitten.getWeight().intValue());

       //кота(cat) замяукаем до смерти
        while (cat.isAlive())
        {
           cat.meow();
        }
        //мурзика ожидает, та же участь ))
        while (murzik.isAlive())
        {
            murzik.meow();
        }
        //Васька лопнет ))
        while (vaska.isAlive())
        {
            vaska.feed(Cat.getRandomDouble(200.50, 450.50));
        }

        //Мурку напоим до состояния отключки ))
        while (murka.isAlive()) {
            murka.drink(Cat.getRandomDouble(5.0, 10.2));
            if (murka.getStatus().equals("Sleeping")) {
                break;
            }
        }
        //Барсик лопнет ))
            while (barsik.isAlive())
            {
                barsik.feed(Cat.getRandomDouble(200.0, 100.0));
            }

        //Зевс будет в умат )) ))
            while(zevs.isAlive())
            {
                zevs.drink(Cat.getRandomDouble(32.5, 44.9));
                if(zevs.getStatus().equals("Sleeping"))
                {
                    break;
                }
            }

            //сейчас фифа играет, но мы её положим спать
        while (fifa.isAlive())
            {
                fifa.drink(Cat.getRandomDouble(2.2, 10.1));
                if(fifa.getStatus().equals("Sleeping"))
                {
                    break;
                }
            }

            //потом она сходит в туалет и снова захочет играть
        while (fifa.isAlive())
            {
                fifa.toilet(Cat.getRandomDouble(2.2, 4.5));
                if (fifa.getStatus().equals("Playing"))
                {
                    break;
                }
            }

        System.out.println("======================");
        System.out.println("cat`s weight is.." + cat.getWeight().intValue());
        System.out.println("cat is.." + cat.getStatus());
        System.out.println("murzik`s weight is.." + murzik.getWeight().intValue());
        System.out.println("murzik is.." + murzik.getStatus());
        System.out.println("vaska`s weight is.." + vaska.getWeight().intValue());
        System.out.println("Всего Васька сожрал " + vaska.getFoodWeight().intValue() + " грамм");
        System.out.println("vaska is.." + vaska.getStatus());
        System.out.println("zevs`s weight is.." + zevs.getWeight().intValue());
        System.out.println("zevs is.." + zevs.getStatus());
        System.out.println("barsik`s weight is.." + barsik.getWeight().intValue());
        System.out.println("Всего Барсик сожрал " + barsik.getFoodWeight().intValue() + " грамм");
        System.out.println("barsik is.." + barsik.getStatus());
        System.out.println("murka`s weight is.." + murka.getWeight().intValue());
        System.out.println("murka is.." + murka.getStatus());
        System.out.println("fifa`s weight is.." + fifa.getWeight().intValue());
        System.out.println("fifa is.." + fifa.getStatus());
        System.out.println("zevsTwin`s weight is .." + zevsTwin.getWeight().intValue());
        System.out.println("zevsTwin is .." + zevsTwin.getStatus());
        System.out.println("kitten`s weight is .." + kitten.getWeight().intValue());
        System.out.println("kitten is .." + kitten.getStatus());
*/
        System.out.println("Осталось кошек .... " + Cat.getCount());
    }//end main

}//end class


	
