//variables
//string, number, boolean, nulll, undefined, bigint, symbol

interface Mountain {
  name: string;
  height: number;
}

let mountains: Mountain[] = [
  { name: "Kilimanjaro", height: 19341 },
  { name: "Everest", height: 29029 },
  { name: "Denali", height: 20310 },
];

const findNameOfTallestMountain = (mountains: Mountain[]): string => {
  let tallestMountain: number = 0;
  let tallestMountainName: string = "";
  for (let mountain of mountains) {
    if (mountain.height > tallestMountain) {
      tallestMountain = mountain.height;
      tallestMountainName = mountain.name;
    }
  }
  return tallestMountainName;
};

let tallestMountain: string = findNameOfTallestMountain(mountains);
console.log(tallestMountain);

interface Product {
  name: string;
  price: number;
}

let products: Product[] = [
  { name: "Marshmallows", price: 2.99 },
  { name: "Chocolate", price: 3.99 },
  { name: "Graham Crackers", price: 1.99 },
];

const calculateAverageProductPrice = (products: Product[]): number => {
  let total: number = 0;
  for (let product of products) {
    total += product.price;
  }
  return total / products.length;
};

let averagePrice: number = calculateAverageProductPrice(products);
console.log(averagePrice);

interface InventoryItem {
  product: Product;
  quantity: number;
}

let inventory: InventoryItem[] = [
  { product: { name: "motor", price: 10.0 }, quantity: 10 },
  { product: { name: "sensor", price: 12.5 }, quantity: 4 },
  { product: { name: "LED", price: 1.0 }, quantity: 20 },
];

const calcInventoryValue = (items: InventoryItem[]): number => {
  let total: number = 0;
  for (let item of items) {
    total += item.product.price * item.quantity;
  }
  return total;
};

const inventoryValue: number = calcInventoryValue(inventory);
console.log(inventoryValue);
