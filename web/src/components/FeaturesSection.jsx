const features = [
    {
        title: "Public Domain Library",
        icon: "🏛️"
    },
    {
        title: "Unlimited Formats",
        icon: "📄"
    },
    {
        title: "VST Support",
        icon: "🎹"
    },
    {
        title: "100% Free",
        icon: "🎵"
    }
];

function FeaturesSection() {
    return (
        <section className={`bg-[#252422] w-full py-12 px-8 rounded-2xl shadow-2xl`}>
            <div className={`min-w-9/12 max-w-full mx-auto`}>
                <div className={`grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-8`}>
                    {features.map((feature, index) => (
                        <div key={index} className={`flex items-center gap-4 bg-[#403D39]/30 border cursor-pointer border-[#CCC5B9]/10 p-3 rounded-lg hover:border-[#EB5E28]/50 transition-all group hover:-translate-y-2`}>
                            <div className={`text-lg group-hover:scale-110 transition-transform duration-300`}>
                                {feature.icon}
                            </div>
                            <h3 className={`text-[#FFFCF2] font-bold text-lg`}>
                                {feature.title}
                            </h3>
                        </div>
                    ))}
                </div>
            </div>
        </section>
    );
}

export default FeaturesSection;