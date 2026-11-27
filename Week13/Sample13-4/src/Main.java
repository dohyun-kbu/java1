void main() throws IOException {
    int[] score;
    int sum;

    score = Input.readData(Subject.values().length);
    sum = Compute.total(score);
    Output.display(score, sum);
}