package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Создание экземпляра бинарного дерева
        BinaryTree tree = new BinaryTree();

        // Добавление узлов в дерево
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Проверка существования узлов
        System.out.println(tree.search(50)); // Вывод: true (узел 50 существует)
        System.out.println(tree.search(90)); // Вывод: false (узел 90 не существует)
    }
}
