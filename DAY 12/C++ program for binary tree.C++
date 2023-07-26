#include <iostream>

struct Node {
    int data;
    Node* left;
    Node* right;

    Node(int value) : data(value), left(nullptr), right(nullptr) {}
};

class BinaryTree {
private:
    Node* root;

    Node* insertRecursive(Node* root, int value) {
        if (root == nullptr)
            return new Node(value);

        if (value < root->data)
            root->left = insertRecursive(root->left, value);
        else if (value > root->data)
            root->right = insertRecursive(root->right, value);

        return root;
    }

    void inOrderTraversalRecursive(Node* root) {
        if (root != nullptr) {
            inOrderTraversalRecursive(root->left);
            std::cout << root->data << " ";
            inOrderTraversalRecursive(root->right);
        }
    }

public:
    BinaryTree() : root(nullptr) {}

    void insert(int value) {
        root = insertRecursive(root, value);
    }

    void inOrderTraversal() {
        std::cout << "In-order Traversal: ";
        inOrderTraversalRecursive(root);
        std::cout << std::endl;
    }
};

int main() {
    BinaryTree tree;

    // Insert elements into the binary tree
    tree.insert(5);
    tree.insert(3);
    tree.insert(7);
    tree.insert(1);
    tree.insert(4);
    tree.insert(6);
    tree.insert(8);

    // Display the binary tree elements in ascending order
    tree.inOrderTraversal();

    return 0;
}
