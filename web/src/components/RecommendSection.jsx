import RecommendCard from "../components/RecommendCard";

const recommendedData = [
    { id: 1, title: "Nocturne Op. 9 No. 2", author: "Frédéric Chopin", category: "Public Domain", views: "12k" },
    { id: 2, title: "Waltz Cis-Moll", author: "Norbert Dominkiewicz", category: "Original", views: "850" },
    { id: 3, title: "Moonlight Sonata", author: "L. van Beethoven", category: "Public Domain", views: "25k" },
    { id: 4, title: "Jazz Improvisation #1", author: "Jan Kowalski", category: "Original", views: "1.2k" },
    { id: 5, title: "Clair de Lune", author: "Debussy", category: "Public Domain", views: "99.2k" },
];

function RecommendSection() {
    return (
        <section className="bg-transparent w-full rounded-2xl py-8 px-8">
            <div className="max-w-auto mx-auto">
                <div className="flex justify-start items-end mb-8 border-b-3 border-[#252422] pb-4">
                    <div>
                        <h2 className="text-[#FFFCF2] text-3xl font-bold">Our recommendations</h2>
                    </div>
                </div>

                <div className="grid grid-cols-2 md:grid-cols-3 lg:grid-cols-5 gap-6">
                    {recommendedData.map(score => (
                        <RecommendCard key={score.id} score={score} />
                    ))}
                </div>
            </div>
        </section>
    );
}

export default RecommendSection;