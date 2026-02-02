function RecommendCard({ score }) {
    return (
        <div className="bg-[#252422] border border-[#CCC5B9]/10 rounded-xl p-4 hover:bg-[#1b1b1a] transition-colors cursor-pointer group">
            <div className="aspect-6/5 bg-[#403D39]/20 rounded-lg mb-4 flex items-center justify-center overflow-hidden border border-[#CCC5B9]/5">
                {score.imageUrl ? (
                    <img src={score.imageUrl} alt={score.title} className="w-full h-full object-cover opacity-80 group-hover:opacity-100 transition-opacity" />
                ) : (
                    <span className="text-[#CCC5B9]/20 text-4xl">🎼</span>
                )}
            </div>
            <h3 className="text-[#FFFCF2] font-semibold truncate text-sm md:text-base">{score.title}</h3>
            <p className="text-[#CCC5B9] text-xs mt-1">{score.author}</p>
            <div className="mt-3 flex items-center justify-between">
                <span className="text-[10px] uppercase tracking-widest text-[#EB5E28] font-bold">
                    {score.category}
                </span>
                <span className="text-[#CCC5B9] text-[10px] italic">
                    {score.views} views
                </span>
            </div>
        </div>
    );
}

export default RecommendCard;