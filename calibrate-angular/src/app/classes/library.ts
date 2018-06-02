export class Library {

    libraryId: number;
    name: string;
    status: Status;
    accountId: number;
    question: Question[];
}

enum Status {
    PRIVATE = 0,
    PENDING = 1,
    PUBLIC = 2
}

export class Question {

    questionId: number;
    difficulty: number;
    value: string;
    libraryId: number;
    answers: Answers[];

}

class Answers {

    answerId: number;
    isCorrect: boolean;
    value: string;
    questionId: number;
    
}
