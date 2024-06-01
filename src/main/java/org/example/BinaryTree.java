package org.example;

public class BinaryTree {
    private TreeNode root;

    // Класс, представляющий узел бинарного дерева
    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        // Конструктор для создания нового узла
        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Метод для добавления нового узла в дерево
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // Рекурсивный метод для добавления нового узла в дерево
    // Вставляет узел с ключом data в дерево с корнем root
    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // Метод для проверки существования узла с заданным ключом
    public boolean search(int data) {
        return searchRec(root, data);
    }

    // Рекурсивный метод для поиска узла с заданным ключом
    // Ищет узел с ключом data в дереве с корнем root
    private boolean searchRec(TreeNode root, int data) {
        if (root == null) {
            return false;
        }

        if (data == root.data) {
            return true;
        }

        if (data < root.data) {
            return searchRec(root.left, data);
        } else {
            return searchRec(root.right, data);
        }
    }
}