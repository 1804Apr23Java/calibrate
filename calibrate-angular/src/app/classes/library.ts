import { Question } from './question';

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

