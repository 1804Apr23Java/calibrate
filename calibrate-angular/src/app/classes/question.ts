export class Question {

    questionId: number;
    difficulty: number;
    value: string;
    libraryId: number;
    answers: Answers[];

}

export class Answers {

    answerId: number;
    isCorrect: boolean;
    value: string;
    questionId: number;
    isSelected: boolean;
}
