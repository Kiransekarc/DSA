/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *rotateOnce(struct ListNode *head) {
    if (head == NULL || head->next == NULL) {
        return head;
    }
    struct ListNode *current = head;
    struct ListNode *previous = NULL;
    while (current->next != NULL) {
        previous = current;
        current = current->next;
    }
    previous->next = NULL;
    current->next = head;
    head = current;
    return head;
}
struct ListNode* rotateRight(struct ListNode* head, int k) {
    if (head == NULL || head->next == NULL || k == 0) {
        return head;
    }  

    int n = 0;
    struct ListNode *current = head;
    while (current != NULL) {
        n++;
        current = current->next;
    }

    k = k % n;    
    if (k == 0) {
        return head;
    } 

    for (int i = 0; i < k; i++) {
        head = rotateOnce(head);
    }

    return head;
}