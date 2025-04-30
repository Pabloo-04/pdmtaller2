import com.pdmtaller2.C00080323_PabloVides.data.Dish
import com.pdmtaller2.C00080323_PabloVides.data.Restaurant

val Restaurants = listOf(
    Restaurant(
        id = 1,
        name = "El Taco Loco",
        description = "Authentic street-style tacos and burritos.",
        imageUrl = "https://static.wixstatic.com/media/bd3cd7_b7f2c8fdc13144b38c4928a2d90910fa~mv2.png/v1/fit/w_2500,h_1330,al_c/bd3cd7_b7f2c8fdc13144b38c4928a2d90910fa~mv2.png",
        category = "Mexican",
        dishes = listOf(
            Dish(
                id = 1,
                name = "Carne Asada Tacos",
                description = "Grilled steak with onions and cilantro.",
                imageUrl = "https://www.salvadoreñonoticias.com/wp-content/uploads/2025/03/1000138850-1024x473.jpg"
            ),
            Dish(
                id = 2,
                name = "Chicken Quesadilla",
                description = "Melted cheese and grilled chicken in a crispy tortilla.",
                imageUrl = "https://d2j6dbq0eux0bg.cloudfront.net/images/26912426/4537922295.jpg"
            ),
            Dish(
                id = 3,
                name = "Guacamole & Chips",
                description = "Creamy avocado with lime and tomatoes.",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8_mwOUpMpXXGNf05MYKNfakIlTu9aWZc8Xg&s"
            )
        )
    ),
    Restaurant(
        id = 2,
        name = "La Casa de Enchiladas",
        description = "Enchiladas like abuela used to make.",
        imageUrl = "https://ii.ct-stc.com/10/logos/empresas/2016/09/10/laca-laca-B8AD136833FA79BEthumbnail.jpeg",
        category = "Mexican",
        dishes = listOf(
            Dish(
                id = 4,
                name = "Green Enchiladas",
                description = "Filled with chicken and topped with tomatillo salsa.",
                imageUrl = "https://images.unsplash.com/photo-1601924582975-7e1e3d8e6c3e"
            ),
            Dish(
                id = 5,
                name = "Pozole",
                description = "Traditional hominy stew with pork.",
                imageUrl = "https://images.unsplash.com/photo-1605475129361-3b5e3f1e3c3e"
            ),
            Dish(
                id = 6,
                name = "Churros",
                description = "Cinnamon sugar sticks served with chocolate dip.",
                imageUrl = "https://images.unsplash.com/photo-1589308078054-8328e5f3e3e3"
            )
        )
    ),
    Restaurant(
        id = 3,
        name = "Burrito Bros",
        description = "Modern twist on Mexican classics.",
        imageUrl = "https://comelongo.com/wp-content/uploads/2022/05/260409637_229207146009294_7822634584804299539_n-580x408.jpg",
        category = "Mexican",
        dishes = listOf(
            Dish(
                id = 7,
                name = "Chipotle Burrito",
                description = "Spicy beef with rice, beans, and chipotle sauce.",
                imageUrl = "https://images.unsplash.com/photo-1601924582975-7e1e3d8e6c3e"
            ),
            Dish(
                id = 8,
                name = "Nacho Supreme",
                description = "Loaded nachos with cheese, jalapeños, and ground beef.",
                imageUrl = "https://images.unsplash.com/photo-1605475129361-3b5e3f1e3c3e"
            ),
            Dish(
                id = 9,
                name = "Mexican Street Corn",
                description = "Grilled corn with mayo, chili powder, and lime.",
                imageUrl = "https://images.unsplash.com/photo-1589308078054-8328e5f3e3e3"
            )
        )
    ),
    Restaurant(
        id = 4,
        name = "Pasta Palace",
        description = "Home of fresh pasta and rich sauces.",
        imageUrl = "https://media.licdn.com/dms/image/v2/C4E1BAQGQM0rpJhuzxA/company-background_10000/company-background_10000/0/1596652204053/_olive_garden_cover?e=2147483647&v=beta&t=YCvwLwxZRF0EdDu6AP8TAIS0YUSiaDb8o6JHSkihZoo",
        category = "Italian",
        dishes = listOf(
            Dish(
                id = 10,
                name = "Fettuccine Alfredo",
                description = "Creamy Alfredo sauce with fresh pasta.",
                imageUrl = "https://images.unsplash.com/photo-1601924582975-7e1e3d8e6c3e"
            ),
            Dish(
                id = 11,
                name = "Margherita Pizza",
                description = "Classic pizza with fresh mozzarella and basil.",
                imageUrl = "https://images.unsplash.com/photo-1605475129361-3b5e3f1e3c3e"
            ),
            Dish(
                id = 12,
                name = "Tiramisu",
                description = "Coffee-flavored dessert with mascarpone.",
                imageUrl = "https://images.unsplash.com/photo-1589308078054-8328e5f3e3e3"
            )
        )
    ),
    Restaurant(
        id = 5,
        name = "Luigi’s Trattoria",
        description = "Traditional Italian comfort food.",
        imageUrl = "https://lovebeverlyhills.com/uploads/cache/Image/BlockFeaturedBlock/id/8618/db5f53060ad41ebc63376b5bc7c4b368d6ea86c0.jpg",
        category = "Italian",
        dishes = listOf(
            Dish(
                id = 13,
                name = "Spaghetti Carbonara",
                description = "Pasta with eggs, cheese, and pancetta.",
                imageUrl = "https://images.unsplash.com/photo-1601924582975-7e1e3d8e6c3e"
            ),
            Dish(
                id = 14,
                name = "Bruschetta",
                description = "Toasted bread with tomato and basil.",
                imageUrl = "https://images.unsplash.com/photo-1605475129361-3b5e3f1e3c3e"
            ),
            Dish(
                id = 15,
                name = "Gelato",
                description = "Italian-style ice cream in various flavors.",
                imageUrl = "https://images.unsplash.com/photo-1589308078054-8328e5f3e3e3"
            )
        )
    ),
    Restaurant(
        id = 6,
        name = "Roma Ristorante",
        description = "Elegant dining with classic Italian flair.",
        imageUrl = "https://images.squarespace-cdn.com/content/v1/62fe6e3c0caa6b5fa067b8e3/b68add82-87b7-451e-935d-30db793312d4/PIA_151_La_Jolla_Restaurant_Remodel28891.jpg",
        category = "Italian",
        dishes = listOf(
            Dish(
                id = 16,
                name = "Lasagna",
                description = "Layered pasta with meat and cheese.",
                imageUrl = "https://images.unsplash.com/photo-1601924582975-7e1e3d8e6c3e"
            ),
            Dish(
                id = 17,
                name = "Caprese Salad",
                description = "Mozzarella, tomatoes, and basil.",
                imageUrl = "https://images.unsplash.com/photo-1605475129361-3b5e3f1e3c3e"
            ),
            Dish(
                id = 18,
                name = "Panna Cotta",
                description = "Silky dessert with berry sauce.",
                imageUrl = "https://images.unsplash.com/photo-1589308078054-8328e5f3e3e3"
            )
        )
    ) ,Restaurant(
        id = 7,
        name = "Burger Barn",
        description = "Juicy burgers made from 100% Angus beef.",
        imageUrl = "https://www.papercitymag.com/wp-content/uploads/2017/07/Screen-Shot-2017-07-19-at-3.54.18-PM.png",
        category = "Burgers",
        dishes = listOf(
            Dish(
                id = 19,
                name = "Classic Cheeseburger",
                description = "Beef patty with cheese, lettuce, and tomato.",
                imageUrl = "https://images.unsplash.com/photo-1601924582975-7e1e3d8e6c3e"
            ),
            Dish(
                id = 20,
                name = "Bacon Deluxe",
                description = "Burger topped with crispy bacon and BBQ sauce.",
                imageUrl = "https://images.unsplash.com/photo-1605475129361-3b5e3f1e3c3e"
            ),
            Dish(
                id = 21,
                name = "Onion Rings",
                description = "Crispy battered onion rings.",
                imageUrl = "https://images.unsplash.com/photo-1589308078054-8328e5f3e3e3"
            )
        )
    ),
    Restaurant(
        id = 8,
        name = "SmashGrill",
        description = "Smash-style burgers and loaded fries.",
        imageUrl = "https://img.delicious.com.au/KGXKuXVK/w1200/del/2023/08/wendys-australia-222884-2.jpg",
        category = "Burgers",
        dishes = listOf(
            Dish(
                id = 22,
                name = "Double Smash Burger",
                description = "Two smashed patties with cheese and pickles.",
                imageUrl = "https://images.unsplash.com/photo-1601924582975-7e1e3d8e6c3e"
            ),
            Dish(
                id = 23,
                name = "Chili Cheese Fries",
                description = "Fries topped with beef chili and melted cheese.",
                imageUrl = "https://images.unsplash.com/photo-1605475129361-3b5e3f1e3c3e"
            ),
            Dish(
                id = 24,
                name = "Milkshake",
                description = "Thick and creamy vanilla or chocolate shakes.",
                imageUrl = "https://images.unsplash.com/photo-1589308078054-8328e5f3e3e3"
            )
        )
    ))



