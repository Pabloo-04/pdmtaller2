import com.pdmtaller2.C00080323_PabloVides.data.Dish
import com.pdmtaller2.C00080323_PabloVides.data.Restaurant

val mexicanRestaurants = listOf(
    Restaurant(
        id = 1,
        name = "El Taco Loco",
        description = "Authentic street-style tacos and burritos.",
        imageUrl = "https://images.unsplash.com/photo-1600891964599-f61ba0e24092",
        category = "Mexican",
        dishes = listOf(
            Dish(
                id = 1,
                name = "Carne Asada Tacos",
                description = "Grilled steak with onions and cilantro.",
                imageUrl = "https://images.unsplash.com/photo-1601924582975-7e1e3d8e6c3e"
            ),
            Dish(
                id = 2,
                name = "Chicken Quesadilla",
                description = "Melted cheese and grilled chicken in a crispy tortilla.",
                imageUrl = "https://images.unsplash.com/photo-1605475129361-3b5e3f1e3c3e"
            ),
            Dish(
                id = 3,
                name = "Guacamole & Chips",
                description = "Creamy avocado with lime and tomatoes.",
                imageUrl = "https://images.unsplash.com/photo-1589308078054-8328e5f3e3e3"
            )
        )
    ),
    Restaurant(
        id = 2,
        name = "La Casa de Enchiladas",
        description = "Enchiladas like abuela used to make.",
        imageUrl = "https://images.unsplash.com/photo-1600891964599-f61ba0e24092",
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
        imageUrl = "https://images.unsplash.com/photo-1600891964599-f61ba0e24092",
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
    )
)

val italianRestaurants = listOf(
    Restaurant(
        id = 4,
        name = "Pasta Palace",
        description = "Home of fresh pasta and rich sauces.",
        imageUrl = "https://images.unsplash.com/photo-1600891964599-f61ba0e24092",
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
        imageUrl = "https://images.unsplash.com/photo-1600891964599-f61ba0e24092",
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
        imageUrl = "https://images.unsplash.com/photo-1600891964599-f61ba0e24092",
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
    )
)
val burgerRestaurants = listOf(
    Restaurant(
        id = 7,
        name = "Burger Barn",
        description = "Juicy burgers made from 100% Angus beef.",
        imageUrl = "https://images.unsplash.com/photo-1600891964599-f61ba0e24092",
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
        imageUrl = "https://images.unsplash.com/photo-1600891964599-f61ba0e24092",
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



