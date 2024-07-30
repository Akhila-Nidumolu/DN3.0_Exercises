class Task {
    int tId;
    String tName;
    String status;
    Task next;
    public Task(int tId, String tName, String status) {
        this.tId = tId;
        this.tName = tName;
        this.status = status;
        this.next = null;
    }
}
class TaskManagement {
    private Task head;
    public TaskManagement() {
        head = null;
    }
    public void addTask(Task task) {
        task.next = head;
        head = task;
    }
    public Task searchTask(int tId) {
        Task curr = head;
        while (curr != null) {
            if (curr.tId == tId) {
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }
    public void traverseTasks() {
        Task curr = head;
        while (curr != null) {
            System.out.println(curr);
            curr = curr.next;
        }
    }

    public void deleteTask(int tId) {
        Task curr = head;
        Task prev = null;
        if (curr!= null && curr.tId == tId) {
            head = curr.next;
            return;
        }
        while (curr != null && curr.tId != tId) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) return;
        prev.next = curr.next;
    }
}